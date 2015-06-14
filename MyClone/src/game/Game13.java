package game;

/**
 * java取两个字符串的最大交集
 * 
 * @author Administrator
 * 
 */
public class Game13 {
	public static void main(String[] args) {
		String s1 = "135adbfg67";
		String s2 = "125dbf59";
		String s3 = s2;
		int begin = 0;
		int end = s2.length();
		int i = 1;
		while (!s1.contains(s3)) {
			if (end == s2.length()) {
				begin = 0;
				end = s2.length() - i;
				i++;
			} else {
				begin++;
				end++;
			}//125dbf59 125dbf5 25dbf59 125dbf 25dbf5 5dbf59 125db 25dbf 
			//5dbf5 dbf59 125d 25db 5dbf dbf5 bf59 125 25d 5db dbf
			s3 = s2.substring(begin, end);
			// System.out.println(s3);
			// System.out.println("--------");
		}
		System.out.println(s3);
	}
}
