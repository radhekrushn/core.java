package com.Keywords;

public class ThisDemo {
	
	String name = "Hinal";
	int age = 22;
	
	void getDetails(String name, int age)
	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+age);
	}
	

	public static void main(String[] args) {
	
            ThisDemo hinal = new ThisDemo();
            hinal.getDetails("heena", 23);
	}

}
