
public class lab1 {

	public static void main(String[] args) {
		System.out.println(implication());
		System.out.println(equality());
		System.out.println(disjunction());
	}

	/*
	 * } int d = 13; int g = 9; if (g != d) {
	 * System.out.println("This statement is an Exclusive disjunction"); }
	 * 
	 * 
	 * }
	 */
	public static boolean implication() {
		int a = 5;
		int b = 5;
		int c = 10;
		if (a + b == c) {
			System.out.println("The implication is true");
		}
		return a + b == c;
	}

	public static boolean equality() {

		int x = 7;
		int s = 7;
		if (x == s) {
			System.out.println("The statement is equal");
			return x == s;
		} else {
			System.out.println("The statement is not equal");
			return x == s;
		}
	}

	public static boolean disjunction() {

		int x = 7;
		int s = 8;
		if (x == s) {
			System.out.println("The statement is equal");
			return x == s;
		} else {
			System.out.println("The statement is not equal, it is an Exclusive disjunction");
			return x == s;
		}
	}
}
