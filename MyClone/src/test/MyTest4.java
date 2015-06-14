package test;

public class MyTest4 {

	public static void main(String[] args) {

		int k = 3;
		try {
			test(k);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			test3(k);
		} catch (Error e) {
			System.out.println(e.getMessage());
		}
		System.out.println("异常已处理！");
	}

	public static void test(int k) throws Exception {

		if (k == 2) {
			throw new Error("k不能等于2！");
		} else if (k == 3) {
			throw new Exception("k不能等于3！");
		}

	}

	public static void test2(int k) {
		try {
			if (k == 2) {
				throw new Error("k不能等于2！");
			} else if (k == 3) {
				throw new Exception("k不能等于3！");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} catch (Error e) {
			System.out.println(e.getMessage());

		}
	}

	public static void test3(int k) {
		if (k == 2) {
			throw new Error("k不能等于2！");
		} else if (k == 3) {
		}
	}

}
