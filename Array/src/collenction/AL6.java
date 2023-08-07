package collenction;
import java.util.ArrayList;

public class AL4 {
	public static void main(String[] args) {
		ArrayList ls =new ArrayList();
		// to add TEs
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
		System.out.println(ls1.addAll(ls));
		System.out.println("Total Engineers:"+ ls1.size());
		System.out.println("Toatal list:"+ ls1);
	}

}
