package corejava;

public class NestedLoop {

	public static void main(String[] args) {
		
		// pattern 1
		/* for(int i= 1;i<10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	*/	
		
		
		// pattern 2
		
	for(int i=1;i<=10;i++)
	{
		for(int sp=1;sp<=10-i;sp++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
			

}	
		
		
		
		
		
		
		
		
		
		
	

 // pattern 3 pyramid

/*for(int i=1;i<=10;i++)
{
	for(int sp=1;sp<=10-i;sp++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print(" *");
	}
	System.out.println();
	

	
}
*/

	}

}
