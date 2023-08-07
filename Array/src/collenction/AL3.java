package collenction;

import java.util.*;
import java.util.ArrayList;

class book
{}
class student
{}
class marker
{}
class scanner
{}

public class AL3 {

	public static void main(String[] args) {
    /*create an ArrayList object
     add int value
     add double value
     add char value
     add boolean value
     add string value
     add book object
     add student object
     add marker object
     add scanner object
     */
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(10.5);
		ls.add('A');
		ls.add(true);
		ls.add("Hello");
		ls.add(new book());
		ls.add(new student());
		ls.add(new marker());
		ls.add(new Scanner(System.in));
		
	
	}

}
