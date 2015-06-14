package string;

public class StringTest {
	public static void main(String[] args) {
		String str = "a b c d e f g ";
		// 先去掉前后空格
//		str = str.trim();
		// 去除空格前
		System.out.println("pre:" + str);
		str = str.replace(" ", "");
		// 去除空格后
		System.out.println("after:" + str);
	}
}
