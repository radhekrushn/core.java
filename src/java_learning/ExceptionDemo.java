 package java_learning;
 
 
 import java.util.InputMismatchException;
 import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) { 
		
		  try 
		  {
			  System.out.println("start code.");
			  Scanner Sc = new Scanner(System.in);
			  System.out.println("Enter A : ");
			  int a = Sc.nextInt();
			  System.out.println("Enter B : ");
			  int b = Sc.nextInt();
			  int c = a/b;
			  System.out.println("Divison : "+c);
			  int arr[]= {3,4,5};
			  System.out.println(arr[3]);
		  }
		  
		  catch(Exception e)
		  {
			  System.out.println("Exception caught.");
		  }
		  finally
		  {
			  System.out.println("Finally blok excuted.");
		  }
		
		
		
		


	}

}
