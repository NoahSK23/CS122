import java.util.Scanner;
public class cstest {

	public static void main(String[] args) {
		// Changing this comment is like YES
		// Changing this from school...
		System.out.println("This is a test of CS test");
		
		int julius, noah, mom, dad;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Julius what do you say?");
		julius = in.nextInt();
		
		System.out.println("Mom what do you say?");
		mom = in.nextInt();
		
		System.out.println("Dad what do you say?");
		dad = in.nextInt();
		
		System.out.println("Noah what do you say?");
		noah = in.nextInt();
		
		in.close();
		
		System.out.println("The results say:");
		
		int counter = noah + julius + mom + dad;
		if (counter > 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
