package com.jflyfox.util.cache;

import java.util.ArrayList;
import java.util.List;

import com.jflyfox.util.cache.Cache;
import com.jflyfox.util.cache.CacheManager;

public class TestCache {

	public static void main(String[] args) {
		Cache cache = CacheManager.get("abc");
		List<String> list = new ArrayList<String>();
		list.add("123");
		List<String> list2 = new ArrayList<String>();
		list2.add("123");
		list2.add("1234");
		cache.add("a", list);
		cache.add("b", list2);
		List<String> lista = cache.get("a");
		System.out.println("a:"+lista.size());
		lista.add("1231");
		lista.add("1232");
		lista.add("1233");
		System.out.println("a:"+lista.size());
		List<String> listb = cache.get("b");
		System.out.println("b:"+listb.size());
		List<String> listc = cache.get("a");
		System.out.println("a:"+listc.size());
		cache.add("a", lista);
		List<String> listd = cache.get("a");
		System.out.println("a:"+listd.size());
		System.out.println("必须重新设置才会修改Cache值");
	}
}
