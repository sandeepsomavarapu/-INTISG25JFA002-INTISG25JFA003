

public class Exception3 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];// 0,1,2,3,4
			a[4] = 30/2;
			String s ="123";  
			 int x=Integer.parseInt(s);
			System.out.println(s.length());
			System.out.println("no error  " + a[4]+" "+x);
		}
	
		catch (ArrayIndexOutOfBoundsException ae) {//jvm
			System.out.println("please enter valid index");
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero as denominator");
		}catch (NumberFormatException e) {
			System.out.println("we cant convert string to number");
		}  
		catch (Exception e) {
			System.out.println("unable find length of the string");
			//e.printStackTrace();
			// System.out.println(e.getMessage());
		}
		 finally {
			System.out.println("executes every time for closing connections");
		}
		System.out.println("remaining code  executed...");
	}
}