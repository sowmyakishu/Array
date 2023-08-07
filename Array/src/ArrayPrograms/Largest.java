package ArrayPrograms;

public class Largest {

	public static void main(String[] args) {
      int []a= {10,20,30,48,50,90,15,35};
      int large= a[0];
      for (int i = 0; i < a.length; i++) {
    	  if(a[i]>large) {
    		  large=a[i];
	          }
      }
    		  System.out.println(large);
    	  
		
	}
	}


     