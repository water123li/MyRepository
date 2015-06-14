package test;

public class Recursive {

	public static void main(String[] args) {
		myRecursive(2, 13);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
	}

	public static void myRecursive(int n, int m) {

		System.out.print(n * n + " ");
		if (m > n) {
			myRecursive(n + 1, m);
		}
	}

}
