package part14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some words:");
		String text = sc.nextLine();
		char[] t = text.toCharArray();
		int x = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == 'b') {
				x += 1;
			}

		}
		System.out.println(x);

	}
}
