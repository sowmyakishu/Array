package collenction;
import java.util.ArrayList;

public class ALR1 {

	public static void main(String[] args) {
        ArrayList ls=new ArrayList ();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        System.out.println(ls);
        
        ArrayList ls1=new ArrayList ();
        ls1.add(20);
        ls1.add(40);
        ls1.add(60);
        ls1.add(80);
        System.out.println(ls1);
        
        //to remove common elements between two list
        ls.removeAll(ls1);
        System.out.println("After remove");
        System.out.println(ls);
        
        
	}

}
