package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterReader {
	
	    public static void main(String[] args) throws Exception {
	    	
	    	FileWriter fw = new FileWriter("top1.txt");
	    	String data = "This is FileWriter and Reader Demo.";
	    	fw.flush();
			fw.write(data);
			fw.close();
			System.out.println("Data writtn Successful.");
			
			FileReader fr = new FileReader("tops1.txt");
			int i;
			while((i=fr.read())!=-1);
			{
				System.out.println((char)i);
			}
		}

}
