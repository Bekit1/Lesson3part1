package part13;

import java.util.Arrays;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] b = new int[30];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int i = 0; i < b.length; i++) {
			if (i > 14) {
				b[i] = a[i - 15] * 2;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
