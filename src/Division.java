import java.util.Scanner;
import java.lang.ArithmeticException;
 
class Division {
  public static void main(String[] args) {
 
  int a, b;
  int result=0;
 
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
  
  try
  {
 
  result = a / b;
  
  } catch(ArithmeticException e) {
	  System.out.println("Invalid entry, try again ");
	  System.out.println("Put values again ");
	  a= input.nextInt();
	  b= input.nextInt();
	  result= a/b;
  }
  finally {
  System.out.println("Result = " + result);
  }
}
}
