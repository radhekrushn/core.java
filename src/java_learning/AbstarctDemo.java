package java_learning;



/*
 * Data Abstraction : It is hiding the internal implementation and showing the essential features
 *                                is called Data-Abstraction.
 *                                
 * Abstract-class : it provides partial abstraction.
 * 
 * - we cannot create an object of abstract class.
 * - Abstract class contains abstract-method as well as non-abstract method.
 * 
 * 
 * - Abstract method.
 *    
 *   - abstract methods are those methods, which do not contain any body and they are just declared.
 *   
 *   e.g abstract void f1(); only declaration
 *   
 *   - Non-abstract method contain only body
 *   
 *   e.g void Hi()
 *        {
 *               //code
 *        
 *        }
 *        
 *      - if you have declared the abstract method, then it is compulsory to implement that method
 *        in child class.
 *
 * 
 */

abstract class abs1
{
	  abstract void Hi();  // Abstract Method
	  
	  void Hello()
	  {
		  System.out.println("Non-Abstract Method from Abstract Class.");  // Non-Abstract Method
	  }
}
class abs2 extends abs1
{
	 
	   void Hi()
	   {
		   System.out.println("Abstract Method implemented in abs2");
	   }
}





public class AbstarctDemo {

	public static void main(String[] args) {
		
		      abs2 a1 = new abs2();
		      a1.Hi();
		      a1.Hello();
		

	}

}
