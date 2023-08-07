package collenction;
import java.util.ArrayList;

public class ALR2 {

	public static void main(String[] args) {
        ArrayList ls=new ArrayList ();
        ls.add(50);
        ls.add(20);
        ls.add(60);
        ls.add(40);
        System.out.println(ls);
        
        ArrayList ls1=new ArrayList ();
        ls1.add(20);
        ls1.add(40);
        ls1.add(60);
        ls1.add(80);
        System.out.println(ls1);
        
        //to remove common elements between two list
        ls.retainAll(ls1);
        System.out.println("After retain");
        System.out.println(ls);
        
        
        
        
	}

}