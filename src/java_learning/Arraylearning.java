package java_learning;

import java.util.Scanner;

public class Arraylearning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want to store ?");
		int size = sc.nextInt();
		
		int arry1[] = new int[size];
		
		for(int a=0;a<arry1.length;a++)
		{
			System.out.print("Enter value for Index ["+a+" :]");
			arry1[a] = sc.nextInt();
		}
		
		for(int a=0;a<arry1.length;a++)
		{
			System.out.println("\nValue at Index ["+a+"] = "+arry1[a]);
		}
		
		

	}

}
