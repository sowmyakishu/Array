package ArrayPrograms;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
     int[] a= {10,5,1,12,20};
     System.out.println("Before sorting");
     for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
     Arrays.sort(a);
     System.out.println("After sorting");
     for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}

}
