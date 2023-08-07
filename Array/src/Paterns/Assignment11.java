package Paterns;

public class Assignment11 {

	public static void main(String[] args) {
		int n=4;  int k=2;
	      for (int i = 0; i<n; i++)
	       {    
	    	  for (int j = 0; j < n; j++)
	    	  { 
				if(i>=j) 
					System.out.print(k++ + " ");
				  else
				   System.out.print(" ");
				 k=k+1;
				}
	    	  System.out.println();
	    	
	       }
	}
	
	
	}


