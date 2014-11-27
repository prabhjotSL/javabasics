package introtocs.io;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFiles {

	public static void main(String[] args) {
		// Working with Text Files
		File file = new File("/Users/apple/development/java/IntroToCs/src/introtocs/io/text.txt");
		File file2 = new File("/Users/apple/development/java/IntroToCs/src/introtocs/io/text.txt");
		try {
			// Code that will cause an Exception
			PrintWriter out = new PrintWriter(file);
			Scanner in = new Scanner(file2);
			
			try {
				out.println("THIS IS THE NEW LINE 1");
				out.println("THIS IS THE NEW LINE 2");
				out.println("THIS IS THE NEW LINE 3");
				out.println("THIS IS THE NEW LINE 4");
			}
			finally {
				out.close();
			}
			
			try {
				// Code to read and output the file.
				String contents = in.nextLine();
				
				while(in.hasNextLine()) {
					contents = contents + "\n" + in.nextLine();
				}
				
				System.out.println(contents);
			} finally {
				// Code to close the stream.
				in.close();
			}
		} catch (IOException e) {
			// Code to handle the exception
			e.printStackTrace();
		} 
	}

}
