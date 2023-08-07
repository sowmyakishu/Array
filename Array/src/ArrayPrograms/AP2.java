// Print even index element

package ArrayPrograms;

public class AP2 {
	public static void main(String[] args) {
        int [] a= {4,23,9,8,104,55,54};
   
        for (int i = 0; i < a.length; i++) {
       	if(i%2==0)
       		 System.out.println(a[i]);
			
		}
	}

}
