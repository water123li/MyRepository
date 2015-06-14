package exceptiontest;

public class HelloWorld2 {

	public static void main(String[] args) throws Exception{
		System.out.println("Hello World!!!");

		System.out.println(1 / 0);

		System.out.println("除数为0!");

//		 throw new RuntimeException();// 中止程序

//		System.out.println("除数为零后程序没有终止啊，呵呵!!!");

	}
}
