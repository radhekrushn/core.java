package com.Keywords;

class final1
{
	  final float f = 5.78f;
	  
	  void show()
	  {
		   System.out.println(f);
	  }
}
class final2 extends final1
{
	    void show()
	    {
	    	
	    }
}



public class FinalDemo {

	public static void main(String[] args) {
		
		final1 f1 = new final1();
		f1.show();
		

	}

}
