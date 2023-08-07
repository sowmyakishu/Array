package ArrayPrograms;

public class DuplicateElement {

	public static void main(String[] args) {
      int [] a= {10,20,15,30,20,15,70,60};
      boolean [] b= new boolean[a.length];
       for (int i = 0; i < b.length; i++) {
		if (b[i]==false)
		{
			int count=1;
			for (int j = i+1; j < b.length; j++) {
				if(a[i]==a[j]) {
					count++;
					b[i]=true;
				}
			}
	 if (count>1) {
		 System.out.println(a[i]);
	 }
		}
		
	}
	}

}
