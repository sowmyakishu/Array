// WAJP to create a list of TE as well as list Developers add all the test engineers of first list into the developers list( use only names)

package collenction;
import java.util.ArrayList;

public class AL4 {
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
		ls1.addAll(ls1);
		System.out.println("Total Engineers:"+ ls1.size());
		System.out.println("Toatal list:"+ ls1);
	}

}
