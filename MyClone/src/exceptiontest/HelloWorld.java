package exceptiontest;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");

		try {
			System.out.println(1 / 0);

		} 
		catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("除数为0!");
			 throw e;// 中止程序
//			throw new RuntimeException(e);// 中止程序
		} 
		// catch (Exception e) {
		// e.printStackTrace();
		// }
		System.out.println("除数为零后程序没有终止啊，呵呵!!!");

	}
}
