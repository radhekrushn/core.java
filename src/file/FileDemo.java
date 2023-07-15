package file;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File hb = new File("tops1.txt");
		System.out.println(hb.canRead());
		System.out.println(hb.canWrite());
		System.out.println(hb.getAbsolutePath());
		System.out.println(hb.getFreeSpace());
		System.out.println(hb.isDirectory());
		System.out.println(hb.isFile());
		System.out.println(hb.isHidden());
		
	}

}
