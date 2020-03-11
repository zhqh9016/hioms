package com.taikang.jkx.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.junit.Test;

public class ExcelUtil {

	/**
	 * 向单元格中写元素
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Test
	public void fun1() throws FileNotFoundException, IOException {
		try (HSSFWorkbook wb = new HSSFWorkbook()) {
			HSSFSheet sheet = wb.createSheet("Cell comments in POI HSSF");

			// Create the drawing patriarch. This is the top level container for
			// all shapes including cell comments.
			HSSFPatriarch patr = sheet.createDrawingPatriarch();

			// create a cell in row 3
			HSSFCell cell1 = sheet.createRow(3).createCell(1);
			cell1.setCellValue(new HSSFRichTextString("Hello, World"));

			// anchor defines size and position of the comment in worksheet
			HSSFComment comment1 = patr.createComment(new HSSFClientAnchor(0, 0, 0, 0, (short) 4, 2, (short) 6, 5));

			// ====添加注释开始=====

			// set text in the comment
			comment1.setString(new HSSFRichTextString("We can set comments in POI"));

			// set comment author.
			// you can see it in the status bar when moving mouse over the
			// commented cell
			comment1.setAuthor("Apache Software Foundation");

			// The first way to assign comment to a cell is via
			// HSSFCell.setCellComment method
			cell1.setCellComment(comment1);

			// ====添加注释结束======

			// create another cell in row 6
			HSSFCell cell2 = sheet.createRow(6).createCell(1);
			cell2.setCellValue(36.6);

			HSSFComment comment2 = patr.createComment(new HSSFClientAnchor(0, 0, 0, 0, (short) 4, 8, (short) 6, 11));
			// modify background color of the comment
			comment2.setFillColor(204, 236, 255);

			HSSFRichTextString string = new HSSFRichTextString("Normal body temperature");

			// apply custom font to the text in the comment
			HSSFFont font = wb.createFont();
			font.setFontName("Arial");
			font.setFontHeightInPoints((short) 10);
			font.setBold(true);
			font.setColor(HSSFColorPredefined.RED.getIndex());
			string.applyFont(font);

			comment2.setString(string);
			comment2.setVisible(true); // by default comments are hidden. This
										// one is always visible.

			comment2.setAuthor("Bill Gates");

			/*
			 * The second way to assign comment to a cell is to implicitly
			 * specify its row and column. Note, it is possible to set row and
			 * column of a non-existing cell. It works, the comment is visible.
			 */
			comment2.setRow(6);
			comment2.setColumn(1);

			try (FileOutputStream out = new FileOutputStream("D:/poi_comment.xls")) {
				wb.write(out);
			}
		}

	}

	/**
	 * 从文件中读取数据
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun2() throws IOException {
		FileInputStream fis = new FileInputStream("D:/poi/student.xls");
		HSSFWorkbook hssfWB = new HSSFWorkbook(fis);
		for (int sheetNum = 0; sheetNum < hssfWB.getNumberOfSheets(); sheetNum++) {
			HSSFSheet sheetAt = hssfWB.getSheetAt(sheetNum);
			if (sheetAt == null) {
				continue;
			}
			for (int rowNum = 0; rowNum < sheetAt.getLastRowNum(); rowNum++) {
				HSSFRow row = sheetAt.getRow(rowNum);
				if (row == null) {
					continue;
				}
				for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
					System.out.print(row.getCell(colNum) + "\t");
				}
				System.out.println();
			}
		}
		hssfWB.close();
	}

	public static String readCell(HSSFCell cell) {
		String result = null;
		if (cell != null) {
			CellType cellTypeEnum = cell.getCellTypeEnum();
			switch (cellTypeEnum) {
			case BOOLEAN:
				result = cell.getBooleanCellValue() + "";
				break;
			case NUMERIC:
				NumberFormat nf = NumberFormat.getInstance();
				result = nf.format(cell.getNumericCellValue());
				if (result.indexOf(",") >= 0) {
					result = result.replace(",", "");
				}
				break;
			case STRING:
				result = cell.getStringCellValue();
				break;
			case FORMULA:
				result = cell.getCellFormula();
				break;
			default:
				result = null;
				break;
			}
		}
		return result;
	}

	public static String parseExcel(HSSFCell cell) {
		String result = new String();
		switch (cell.getCellTypeEnum()) {
		case NUMERIC:// 数字类型
			if (HSSFDateUtil.isCellDateFormatted(cell)) {// 处理日期格式、时间格式
				SimpleDateFormat sdf = null;
				if (cell.getCellStyle().getDataFormat() == HSSFDataFormat.getBuiltinFormat("h:mm")) {
					sdf = new SimpleDateFormat("HH:mm");
				} else {// 日期
					sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				}
				Date date = cell.getDateCellValue();
				result = sdf.format(date);
			} else if (cell.getCellStyle().getDataFormat() == 58) {
				// 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				double value = cell.getNumericCellValue();
				Date date = org.apache.poi.ss.usermodel.DateUtil.getJavaDate(value);
				result = sdf.format(date);
			} else {
				double value = cell.getNumericCellValue();
				CellStyle style = cell.getCellStyle();
				DecimalFormat format = new DecimalFormat();
				String temp = style.getDataFormatString();
				// 单元格设置成常规
				if (temp.equals("General")) {
					format.applyPattern("#");
				}
				result = format.format(value);
			}
			break;
		case STRING:// String类型
			result = cell.getRichStringCellValue().toString();
			break;
		case BLANK:
			result = "";
		default:
			result = "";
			break;
		}
		return result;
	}
}
