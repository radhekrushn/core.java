package corejava; 

import java.util.Scanner;

public class marks_grade_program {

	public static void main(String[] args) {
		
		System.out.println("\n<---display grades according to marks");
		Scanner sc = new Scanner(System.in);
		
		int mathes, physics,chemistry,science,Total;
		float percentage;
		
		System.out.print("Enter your mathes marks :");
		mathes = sc.nextInt();
		System.out.print("Enter your physics marks :");
		physics =  sc.nextInt();
		System.out.print("Enter your chemistry marks :");
		chemistry =  sc.nextInt();
		System.out.print("Enter your science marks :");
		science =  sc.nextInt();
		
		Total = (mathes+physics+chemistry+science);
		percentage = ((float)Total/3);
		System.out.println("\nTotal marks (M+P+C+S) : "+Total);
		System.out.println("percnetage :"+percentage);
		
		if(percentage>=91)
		{
			System.out.print("Grade : AA");
		}
		else if(percentage>=81)
		{
			System.out.print("Grade : AB");
		}
		else if(percentage>=71)
		{
			System.out.print("Grade : BB");
		}
		else if(percentage>=61)
		{
			System.out.print("Grade : BC");
		}
		else if(percentage>51)
		{
			System.out.print("Grade : CD");
		}
		else if(percentage>41)
		{
			System.out.print("Grade : DD");
		}
		else
		{
			System.out.println("you are fail!!!");
		}
		
		
	}

}
