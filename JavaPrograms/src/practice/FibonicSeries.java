package practice;

public class FibonicSeries {

	public static void main(String[] args) {

		upto_some_nmber(15);
		First_n_numbers(15);
	}

	public static void upto_some_nmber(int n) {
		int t1 = 0, t2 = 1;

		System.out.println("Upto " + n + ": ");
		while (t1 <= n) {
			System.out.print(t1 + " + ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println();
	}

	public static void First_n_numbers(double n) {
		int i = 1, t1 = 0, t2 = 1;
		System.out.println("First " + n + " terms: ");

		while (i <= n) {
			System.out.print(t1 + " + ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

			i++;
		}
	}
}
