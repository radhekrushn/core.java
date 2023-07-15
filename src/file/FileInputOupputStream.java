package file;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOupputStream {
	
	public static void main(String[] args) throws Exception{
		
		
		              FileOutputStream hlr = new  FileOutputStream("tops.text"); 
		              
		              String  data = "This is Tops Technologies with FileInput";
		              byte a[] = data.getBytes(); // it will store byte by byte in a.
		              hlr.write(a); // write into file
		              hlr.close(); // file close
		              System.out.println("Data is written in file.");
		              
		              // Reading into the file
		              
		              FileInputStream hlk = new FileInputStream("tops.txt");
		              int b=0;
		              while((b=hlk.read())!=-1)
		              {
		            	  System.out.println((char)b);
		              }
		              
		              
		              
		              
		              
	}

}
