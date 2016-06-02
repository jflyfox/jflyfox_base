package com.jflyfox.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.jflyfox.util.FileUtils;

public class TestFile {
	public final static String ROOT_PATH = TestFile.class.getResource("/").getFile();

	public static void main(String[] args) throws IOException {
		String path = ROOT_PATH + File.separator + "music.data";
		System.out.println(path);
		byte[] tmp = { 1, 2, 3, 4, 5 };
		FileUtils.write(path, tmp);
		byte[] data = FileUtils.read(path);
		System.out.println(Arrays.toString(data));

	}
}
