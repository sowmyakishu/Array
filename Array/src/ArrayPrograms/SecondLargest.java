package ArrayPrograms;

public class SecondLargest {

	public static void main(String[] args) {
       int[]a= {20,60,30,98,90,70};	
       for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
       System.out.println("The second largest" + a[a.length-1]);
       
	}

}
