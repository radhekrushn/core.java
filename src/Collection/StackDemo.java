package Collection;

// it follows LIFO order.
       
// its stores multiple values of multiple types. 

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack hlr = new Stack();
		hlr.push(6);
		hlr.push(2.3f);
		hlr.push('h');
		hlr.push(true);
		hlr.push(null);
		hlr.push(6);
		hlr.push("Hinal");
		System.out.println(hlr);
		

		
		
		System.out.println(hlr.pop());
		System.out.println(hlr.pop());
		System.out.println(hlr.pop());
		System.out.println(hlr.pop());
		System.out.println(hlr.pop());
		System.out.println(hlr.pop());
		System.out.println(hlr.pop());
		
		
	}

}
