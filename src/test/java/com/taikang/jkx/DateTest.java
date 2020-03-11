package com.taikang.jkx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void fun1(){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format2 = format.format(date);
		System.out.println(format2);
		
	}
	
	@Test
	public void fun2(){
		String fileName = "1.jpg";
		String[] split = fileName.split("\\.");
		System.out.println(split.length);
	}
	
	/**
	 * 测试linkedHashMap
	 */
	@Test
	public void fun3(){
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "3");
		map.put(2, "2");
		map.put(6, "6");
		map.put(4, "4");
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	/**
	 * 测试linkedHashMap
	 */
	@Test
	public void fun4(){
		Map<Double, String> map = new HashMap<>();
		map.put(3.34, "3");
		map.put(2.58, "2");
		map.put(6.01, "6");
		map.put(4.26, "4");
		Set<Entry<Double,String>> entrySet = map.entrySet();
		for (Entry<Double, String> entry : entrySet) {
			Double key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	/**
	 * 测试null如何转成空字符串
	 */
	@Test
	public void fun5(){
		String valueOf = String.valueOf(null);
		System.out.println(valueOf);
	}
	
	/**
	 * 
	 */
	@Test
	public void fun6(){
		String str = "2018-10-10 10:10:10";
		boolean matches = str.matches("\\d{4}-\\d{2}-\\d{2}.*");
		System.out.println(matches);
	}
	
	@Test
	public void fun7(){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String format2 = format.format(date);
		System.out.println(format2);
	}
	
	@Test
	public void fun8(){
		String str = "2018\\10\\10";
		boolean matches = str.matches("\\d{4}\\\\\\d{2}\\\\\\d{2}");
		System.out.println(matches);
	}
	
	@Test
	public void fun9(){
		String str = "\\";
		System.out.println(str.matches("\\\\"));
	}
	
	@Test
	public void fun10(){
		System.out.println((true||true||true)&&!false);
	}
	
	/**
	 * 比较两个时间的大小
	 * @throws ParseException 
	 */
	@Test
	public void fun11() throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = format.parse("2019-01-10 00:00:00");
		Date date2 = format.parse("2019-08-01 00:00:00");
		int compareTo = date1.compareTo(date2);
		System.out.println(compareTo);
		System.out.println(date2.compareTo(date1));
		System.out.println(date2.compareTo(date2));
		
		System.out.println(date1);
		System.out.println(date2);
	}
}
