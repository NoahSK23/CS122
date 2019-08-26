
public class lab1 {

	public static void main(String[] args) {
		System.out.println(implication());
	}
		/* int a = 5;
		int b = 5;
		int c = 10;
		if (a+b==c) {
			System.out.println("The implication is true");
		}
		int x = 7;
		int s = 7;
		if (x==s) {
			System.out.println("The statement is true");
		}
		int d = 13;
		int g = 9;
		if (g != d) {
			System.out.println("This statement is an Exclusive disjunction");
		}
		

	}
*/
	public static boolean implication() {
		int a = 5;
		int b = 5;
		int c = 10;
		if (a+b==c) {
			System.out.println("The implication is true");
		}
		return a+b==c;
	}
}
