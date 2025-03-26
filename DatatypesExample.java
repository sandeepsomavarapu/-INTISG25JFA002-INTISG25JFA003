class DatatypesExample{
	int marks=123;//global variable
	public static void addOfTwo(int a,int b)
	{
		System.out.println("add of two numbers"+(a+b));
	}
	public static int subOfTwo(int a,int b)
	{
	 	return a-b;	
	}
	public static String sayHello()
	{
		return "Hello !!!"
	}
	public static void main(String args[])
	{
		addOfTwo(1,2);	
		System.out.println(subOfTwo(2,2));	
		addOfTwo(3,2);	
		String message=sayHello();	
		System.out.println(message)
		//local variables
		float salary=234.67827291936f;
		double result=234.67827291936;
		char gender='M';//unicode
		boolean toggle=false;
		short totalmarks=32000;
		System.out.println(salary+" "+result+" "+gender);
	}
}