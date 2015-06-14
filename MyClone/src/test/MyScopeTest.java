package test;

public class MyScopeTest {

	public static void main(String[] args) {

		int[] ks = { 9, 7, 8 };

		for (int t : ks) {
			int k = t;
			if (k == 7) {
				k = 3;
			} else if (k == 8) {
				k = 2;
			} else {
				k = 1;
			}
			for (int i = 0; i < 3; i++) {
			
				System.out.println("处理后---k:---" + k);
			}
		}

	}

	public static int sum(int a, int b, int c) {

		return a + b;
	}

}
