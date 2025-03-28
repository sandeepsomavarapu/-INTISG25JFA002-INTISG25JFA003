
class Exception5
{  
  public static void main(String args[])
{  
  try
{  
	  
	  System.out.println("welcome");
	  int data=25/5;  
	  System.exit(0);
   //System.out.println(data);  	  
  }  
 finally
         { 
      System.out.println("finally block is always executed");
              }  
  System.out.println("rest of the code...");  
  }  
  
}