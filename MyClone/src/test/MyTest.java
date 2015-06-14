package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyTest {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("1", "hh");
		Integer[] intArray = new Integer[10];
		Number[] numberArray = intArray;

		String ss = ifThenElse(true, "a", "b");
		Integer ii = ifThenElse(true, new Integer(1), new Integer(2));
		
		try {
			Class clazz = Class.forName("com.cnblogs.test.User");
			System.out.println(clazz.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}


	public static <T> void show(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	public static <T> void show2(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	public static <T> T ifThenElse(boolean b, T first, T second) {
		return b ? first : second;
	}

	public static int sum(int a, int b, int c) {

		return a + b;
	}

}
