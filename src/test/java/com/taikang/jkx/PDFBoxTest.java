package com.taikang.jkx;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.io.RandomAccessBuffer;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.printing.PDFPageable;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.junit.Test;

public class PDFBoxTest {
	
	//判断一个像素是不是白色的阀值
	public static int IS_WHITE_RGB_VALUE = 550;
		
	@Test
	public void fun1() throws IOException{
		System.setProperty("sun.java2d.cmm", "sun.java2d.cmm.kcms.KcmsServiceProvider");
//		RandomAccessBuffer rab = new RandomAccessBuffer(new FileInputStream("E:/扫描件组合.pdf"));
		PDDocument doc = PDDocument.load(new File("E:/扫描件组合.pdf"),MemoryUsageSetting.setupTempFileOnly());
		PDFRenderer pdfRender = new PDFRenderer(doc);
		BufferedImage bfImage = null;
		int numberOfPages = doc.getNumberOfPages();
		System.out.println(numberOfPages);
		ArrayList<Long> list = new ArrayList<>();
		list.add(0l);
		for (int i = 0; i < numberOfPages; i++) {
			bfImage = pdfRender.renderImage(i);
			//boolean blankPicture = isBlankPicture(bfImage);
			if(calBlacks(bfImage)<100){
				list.add(calBlacks(bfImage));
			}
//			System.out.println(calBlacks(bfImage));
			System.out.println(i);
		}
		list.add(Long.valueOf(numberOfPages-1));
		
		for(int i = 0;i< list.size()-1;i++){
			long start = list.get(i);
			long end = list.get(i+1);
			if( start >= end) 
				continue;
			else{
				
			}
			
		}
		
		for (Long long1 : list) {
			System.out.println(long1);
		}
		doc.close();
	}
	
	public boolean isBlankPicture(BufferedImage bfImage){
		long total = 0;
		int height = bfImage.getHeight();
		int width = bfImage.getWidth();
		for(int i = 0;i<height;i++){
			for(int j = 0;j<width;j++){
				int rgb = bfImage.getRGB(j, i);
				total = total + rgb;
				
			}
		}
		
		if(total > 100){
			return false;
		}
		
		return true;
	}
	
	public long calBlacks(BufferedImage bfImage){
		long total = 0;
		int height = bfImage.getHeight();
		int width = bfImage.getWidth();
		for(int i = 0;i<height;i++){
			for(int j = 0;j<width;j++){
				int rgb = bfImage.getRGB(j, i);
				total = total + isBlack(rgb);
			}
		}
		return total;
	}
	
	/**
	 * 如果R/G/B三个值的和超过一定阀值的，就认为是白色。否则为黑色。
	 * @param i
	 * @return
	 */
	public static int isWhite(int i){
		Color color = new Color(i);
		if(color.getRed()+color.getGreen()+color.getBlue()>IS_WHITE_RGB_VALUE){
			return 1;
		}
		return 0;
	}
	public static int isBlack(int i){
		Color color = new Color(i);
		if(color.getRed()+color.getGreen()+color.getBlue()>IS_WHITE_RGB_VALUE){
			return 0;
		}
		return 1;
	}
	
	@Test
	public void fun2() throws IOException{
		PDDocument doc = PDDocument.load(new File("E:/扫描件组合.pdf"));
		PrinterJob job = PrinterJob.getPrinterJob();
		job.setPageable(new PDFPageable(doc));
		try {
			if (job.printDialog()) {
			    job.print();
			}
		} catch (PrinterException e) {
			e.printStackTrace();
		}
		doc.close();
	}
	
	@Test
	public void fun3() throws IOException {
		PDDocument doc = PDDocument.load(new File("E:/扫描件组合.pdf"));
		PDFRenderer render = new PDFRenderer(doc);
		PDPageTree pages = doc.getDocumentCatalog().getPages();
		for (PDPage pdPage : pages) {
			pdPage.setRotation(50);
		}
		
		doc.save("E:/扫描件组合2.pdf");
	}

}
