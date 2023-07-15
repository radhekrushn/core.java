package multithreading;

public class ThreadDemo {
	
	public static void main(String[] args) throws Exception {
		
		Thread h = Thread.currentThread();
		System.out.println(h);
		
		h.setName("TopsTechThread");
		System.out.println("\nAfter changing name : "+h);
		
		h.setPriority(8);
		System.out.println("\nAfter changing Thread priority : "+h);
		
		 
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println(h+" : "+i);
		}
		
	}

}
