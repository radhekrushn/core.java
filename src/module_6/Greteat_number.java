package module_6;
 
import java.util.Scanner;

public class Greteat_number {

	public static void main(String[] args) {
		
		System.out.println("\n<---Gretest number--->");
		Scanner sc = new Scanner(System.in);
		
		int A,B,C;
		
		System.out.print("Enter value of A :");
		A = sc.nextInt();
		System.out.print("Enter value of B :");
		B = sc.nextInt();
		System.out.print("Enter value of C :");
		C = sc.nextInt();
		System.out.print("\nA = "+A+", B = "+B+", C = "+C);
		
		if(A>B)
		{
			if(A>C)
			{
				System.out.println("\nA is Greater");
			}
			else
			{
				System.out.println("\nB is Greater");
			}
		}
		else
		{
			if(B>C)
			{
				System.out.println("\nB is Greater");
			}
			else
			{
				System.out.println("\nC is Greater");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
