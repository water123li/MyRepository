package test;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class GenericAdd {

	public static <T> void show(T[] t1) {
		for (int i = 0; i < t1.length; i++) {
			System.out.println(i + ":" + t1[i]);
		}
	}

	public static <T> void show2(T t1, T t2) {

		System.out.println(t1 + ":" + t2);

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		String[] s = { "1", "2", "3" };

		IntegerArray aa = new IntegerArray(a);
		System.out.println(aa.at(0));
		
//		int k = 1;
//		show2(k, "1");
//
//		show(s);
	}

}
