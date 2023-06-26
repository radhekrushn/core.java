package corejava;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		
	/*	int i=1;
		
		while(i<=10)
		{
			System.out.println(i+". Hinal");
			i++;
		}
		
   
		int i=1;
		
		do
		{
			System.out.println(i+". Hinal");
			i++;
		}
		while(i<=100);
		
	
		
		// for Loop demo
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		*/
		
		// WAJP ti accept a no.
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}

}
