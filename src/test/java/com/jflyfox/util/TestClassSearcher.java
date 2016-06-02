package com.jflyfox.util;
import java.util.ArrayList;
import java.util.List;

import com.jflyfox.util.annotation.ClassSearcher;


public class TestClassSearcher {

	public static void main(String[] args) {
		List<String> includeJars = new ArrayList<String>();
		List<Class<? extends TestClassSearcher>> controllerClasses = ClassSearcher.findInClasspathAndJars(TestClassSearcher.class,
				includeJars);
		System.out.println(controllerClasses);

	}

}
