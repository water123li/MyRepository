package game;
/**
 * java取两个字符串的最大交集
 * @author Administrator
 *
 */
public class Game15 {
	public static void main(String[] args) {
		String s1 = "135adbfg67";
		String s2 = "125dbf59";
		method(s2, s1);
	}

	public static void method(String max, String min) {
		if (max.length() < min.length()) {
			String s = max;
			max = min;
			min = s;
		}
		String subStr = min;
		for (int begin = 0, end = min.length(), i = 1; !max.contains(subStr); subStr = min
				.substring(begin, end)) {
			if (end == min.length()) {
				begin = 0;
				end = (min.length()) - (i++);
			} else {
				begin++;
				end++;
			}
//			System.out.println(subStr);
//			System.out.println("--------");
		}
		System.out.println(subStr);
	}
}
