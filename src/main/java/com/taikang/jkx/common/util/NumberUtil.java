package com.taikang.jkx.common.util;

public class NumberUtil {
	
	public static Float null2Zero(Float source){
		if(source == null){
			return 0F;
		}else {
			return source;
		}
	}

}
