package collenction;
import java.util.ArrayList;

public class AL5 {
	public static void main(String[] args) {
		ArrayList ls =new ArrayList();
		// to add TE
		ls.add("Smith");
		ls.add("Addam");
		ls.add("John");
		System.out.println("Total TE:"+ls.size());
		System.out.println("TE list:"+ ls);
		// to add DEV
		ArrayList ls1 =new ArrayList();
		// to add TE
		ls1.add("Miller");
		ls1.add("King");
		ls1.add("Jacob");
		System.out.println("Total DE:"+ls1.size());
		System.out.println("DE list:"+ ls1);
		// to add TE list to DE list
		ls.addAll(1,ls1);
		System.out.println("Total Engineers:"+ ls.size());
		System.out.println("Toatal list:"+ ls);
	}

}