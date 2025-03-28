
import java.util.Scanner;
class Exception1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value for devision");
		int a = sc.nextInt();
		System.out.println("Enter Second value for devision");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("division is " + c);
		} catch (Exception e) {
			System.out.println("dont enter zer as denominator");
			//System.out.println(e);
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("remaining 1000 lines of code");
	}
}