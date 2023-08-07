package ArrayPrograms;

public class AP4 {

	public static void main(String[] args) {
        int [] a= {5,21,6,55,87,23};
       int sum=0;
        for (int i = 0; i < a.length; i++) {
        	if(a[i]%1==0)
             sum=sum+a[i];
        }
       		 System.out.println(sum);
			
		}
	}
 