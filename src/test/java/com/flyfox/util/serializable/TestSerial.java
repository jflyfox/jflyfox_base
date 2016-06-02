package com.flyfox.util.serializable;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class TestSerial {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Serializer serializer = new JavaSerializer();
		List<TestObject> list = new ArrayList<TestObject>();
		list.add(new TestObject("aaaa", "vvvv"));
		list.add(new TestObject("aaaa", "vvvv"));
		list.add(new TestObject("aaaa", "vvvv"));
		System.out.println("序列化测试：");
		long time1 = System.currentTimeMillis();
		long length1 = 0;
		for (int i = 1; i <= 100000; i++) {
			List<TestObject> ob = (List<TestObject>) serializer.deserialize(serializer.serialize(list));
			if (i == 100000)
				System.out.println(ob);
			length1 += serializer.serialize(list).length;
		}
		System.out.println("100000次原生序列化测试：" + (System.currentTimeMillis() - time1));
		System.out.println("100000次原生序列化测试体积：" + length1);

		long time2 = System.currentTimeMillis();
		long length2 = 0;
		for (int i = 1; i <= 100000; i++) {
			List<TestObject> ob = (List<TestObject>) serializer.deserialize(serializer.serialize(list));
			if (i == 100000)
				System.out.println(ob);
			length2 += serializer.serialize(list).length;
		}
		System.out.println("100000次原生序列化测试：" + (System.currentTimeMillis() - time2));
		System.out.println("100000次原生序列化测试体积：" + length2);

	}
}

class TestObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private String region;
	private String key;
	public String key1 = "1111111111111111111111111111111111111111111";
	public String key2 = "2你好是打算打算打算打算打算打算打算打";
	public String key3 = "3";
	public String key4 = "4";
	public String key5 = "5";

	public TestObject(String region, String key) {
		super();
		this.region = region;
		this.key = key;
	}

	@Override
	public String toString() {
		return "TestObject [region=" + region + ", key=" + key + "]";
	}

}