package ArrayPrograms;

public class Reverse {

	public static void main(String[] args) {
        int [] a= {22,17,56,48,20};
        int i=0;
        int j=a.length-1;
        System.out.println("Before reversing");
        for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
        while(i<j)
        {
        	int temp=a[i];
        	a[i]=a[j];
        	a[j]=temp;
        	i++;
        	j--;
        }
        System.out.println("After reversing");
        for (int k = 0; k < a.length; k++) {
			System.out.println(a[k] + " ");
		}
		}
	}


