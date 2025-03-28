
class Exception2 {
	public static void main(String[] args) {
		try {
			int a1 = 10;
			int b = 2;
			int c = a1 / b;
		} catch (ArithmeticException ae) {
			 System.out.println("dont enter zero as denominater");
			// System.out.println(ae);
			//ae.printStackTrace();
			// System.out.println(ae.getMessage());
		}
		try {
			int a[] = new int[5];// 0...4
			a[0] = 1;
			a[5] = 6;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("array index  maximum size is 4");
		}
		System.out.println("remaining lines of code");
	}
}