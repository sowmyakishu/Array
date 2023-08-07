package collection;
import java.util.ArrayList;

public class A3 {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList<>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		
		//to convert it to array
		Object[] o=ls.toArray();
		System.out.println(o);
		for (Object object : o) {
			System.out.println(object);
		}
	}	
	
	}