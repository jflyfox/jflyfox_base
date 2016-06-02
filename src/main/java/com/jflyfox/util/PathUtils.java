package com.jflyfox.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 路径处理工具
 * 
 * 2016年6月2日 下午3:52:05
 * flyfox 330627517@qq.com
 */
public class PathUtils {

	public static String rebuild(String path) {
		String newPath = path;
		try {
			newPath =  URLDecoder.decode(newPath, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		newPath = rebuildNoDecode(newPath);
		
		return newPath;
	}
	
	public static String rebuildNoDecode(String path) {
		String newPath = path;
		newPath = newPath.replaceAll("\\\\", "/");
		newPath = newPath.replaceAll("//", "/");
		
		return newPath;
	}
}
