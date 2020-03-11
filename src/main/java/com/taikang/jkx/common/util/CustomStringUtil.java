package com.taikang.jkx.common.util;

public class CustomStringUtil {
	
	public static String nullToEmptyString(Object source){
		if(source == null){
			return "";
		}else{
			return source.toString();
		}
	}

}
