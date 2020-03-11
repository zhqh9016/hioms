package com.taikang.jkx.tools;

import java.util.UUID;

/**
 * uuid工具,主要用来生成主键
 * @author zhangqh27
 *
 */
public class UUIDUtil {
	
	public static String generateUUID(){
		
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString().replace("-", "");
		return uuidStr;
	}
}
