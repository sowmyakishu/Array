package ArrayPrograms;

public class AP3 {
	public static void main(String[] args) {
        int [] a= {5,15,10,25,30,20};
       int sum=0;
        for (int i = 0; i < a.length; i++) {
        	if(a[i]%2==0)
             sum=sum+a[i];
        }
       		 System.out.println(sum);
			
		}
	}

