package test;

/*
 * 高斯在上小学时发明了等差数列求和公式:1+2+..+100=5050。现在问题在于给你一个正整数n，问你他可以表示为多少种连续正整数之和？（自身也算）。
 输入格式：多组数据，每组数据一行，一个正整数n。 0<n<2000000000
 输出格式：每组数据一行，包含一个正整数，表示结果。
 答题说明:
 输入样例
 5
 120
 输出样例：
 2
 4
 解释：
 5=2+3=5
 120=1+2+...+15=22+23+24+25+26=39+40+41=120
 */
import java.util.Scanner;

public class GaussTest {

	public static int gaosi(int start, int end) {
		return (start + end) * (end - start + 1) / 2;
	}

	public static int sum(int expectNum) {

		int k = 1;
		int maxend = (expectNum + 1) / 2;
		int start = 1;
		int end = 2;
		while (end > start && end <= maxend) {
			if (gaosi(start, end) < expectNum) {
				end++;
			} else if (gaosi(start, end) > expectNum) {
				start++;
			} else {
				k++;
				start++;
			}
		}
		return k;
	}

	public static void main(String[] args) {

		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			Scanner s = new Scanner(System.in);
			a[i] = s.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(sum(a[i]));
		}

	}
}
