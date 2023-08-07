// WAJP to to add n number of fruits into a collection by reading from the user.

package collenction;
import java.util.ArrayList;
import java.util.Scanner;

public class AL7 {
 
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of fruits to be added");
		int length = sc. nextInt();
		sc.nextLine();
		for(int i=0; i<length; i++)
		{
		System.out.println("Enter the name of fruit");
		String name= sc.nextLine();
		ls.add(name);
		
		}
		System.out.println(ls);

	}
	}


