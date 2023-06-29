package module_6;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	       
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.print("Factorial of the number: "+fact);  

	}

}
