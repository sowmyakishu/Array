package array;

import java.util.Scanner;

public class string6 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String s1= s.next();
    char [] ch= new char (s1.length());
    for(int i=0; i<ch.length; i++) {
    	ch[i]=s1.charAt(i);
    	System.out.println(ch[i]);
    }
	}

}
