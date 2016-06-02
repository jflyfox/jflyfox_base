package com.jflyfox.util;

import com.jflyfox.util.Config;

public class TestConfig {

	public static void main(String[] args) throws Exception {
		Config.test();
		
		Thread.sleep(10000L);
		System.out.println("rebuild");
		Config.rebuild();
		Config.test();
	}
}
