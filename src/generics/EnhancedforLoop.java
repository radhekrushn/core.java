package generics;

import java.util.ArrayList;
import java.util.HashSet;

public class EnhancedforLoop {
	
	    public static <E> void printArray(E[] inputArray)
	    {
	    	for(E e : inputArray)
	    	{
	    		System.out.print(e+",");
	    	}
	    	System.out.println();	
		}
	    
	    
	    
	    public static void main(String[] args) {
	    	
	    	Integer intArray[]= {10,20,30,40,50,60};
	    	Float floatArray[]= {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f};
	    	Character charArray[]= {'h','i','n','a','l'};
	    	String first = "Hinal";
	    	String second = "12345678";
	    	
	    	printArray(intArray);
	    	printArray(floatArray);
	    	printArray(charArray);
	    	System.out.println(first);
	    	System.out.println(second);
		
			
		}

}
