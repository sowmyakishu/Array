package ArrayPrograms;

public class ZigzagArray {

	public static void main(String[] args) {
       int [] a= {10,30,50,70,90,1,2,3};
       int [] b= {20,40,60,80,100,11,12,13};
       int [] c= new int [a.length + b.length];
       int j=0; // hold the array index of A and B
       int i=0; // hold the index of C array
       while(j<a.length && j<b.length)
       {
    	   c[i]=a[j];
    	   i++;
    	   c[i]=b[j];
    	   i++; j++;
    	   }
    while(j<a.length)// if A array length is grater
    {
    	c[i]=a[j];
    	i++; j++;
    }
    while(j<b.length)// if B array length is grater
    {
    	c[i]=b[j];
    	i++;j++;
    }
    for (int k = 0; k < c.length; k++) {
		System.out.println(c[k]);
	}
}
}
