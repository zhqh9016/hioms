package com.taikang.jkx.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.StringUtils;

public class CustomDateUtil {
	
	public static Date str2Date(String str) throws ParseException{
		
		if(StringUtils.isEmpty(str)){
			return null;
		}
		
		if(str.matches("\\d{4}-\\d{2}-\\d{2}.*")){
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date parse = format.parse(str);
			return parse;
		}
		if(str.matches("\\d+\\.?\\d?")){
			Long valueOf = Long.valueOf(str);
			Date date = new Date(valueOf);
			return date;
		}
		return null;
	}
}
