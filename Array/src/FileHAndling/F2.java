package FileHAndling;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;

public class F2 {

	public static void main(String[] args) throws IOException { 
    //step1: create an object of FOS
	//step2: pass the stored path
		Scanner s=new Scanner(System.in);
		System.out.println("enter the path");
		String path= s.nextLine();
	FileOutputStream fout=new FileOutputStream(path);
	
	// step3: use write method to write the data
	// to write a character A
	
	System.out.println("Enter the data");
	char ch = s.next().charAt(0);
	fout.write(ch);
	System.out.println("Done...!");
	
	// to resume
	fout.close();
	}

}
