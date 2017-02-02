package part1;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				x += 1;
			}

		}
		System.out.println(x);

	}

}
