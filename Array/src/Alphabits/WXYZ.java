package Alphabits;

public class WXYZ {
	public static void main(String[] args) {
		int n=5;
	for (int i = 0; i<n; i++) {
		for (int j = 0; j < n; j++) {
			if(j==0 || j==n-1 || i==3 && j==1 || i==2 && j==2 || i==3 && j==3 )
				System.out.print("* ");
			else
				System.out.print("  ");
			}
		System.out.println();
	}
	for (int i = 0; i<n; i++) {
		for (int j = 0; j < n; j++) {
			if(i==j || i+j==n-1 )
				System.out.print("* ");
			else
				System.out.print("  ");
			}
		System.out.println();
	}
	for (int i = 0; i<n; i++) {
		for (int j = 0; j < n; j++) {
			if(i+j==n-1 || i==0 && j==0 || i==1 && j==1)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
		System.out.println();
	}
	for (int i = 0; i<n; i++) {
		for (int j = 0; j < n; j++) {
			if(i+j==n-1 || i==0 || i==n-1)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
		System.out.println();
	}
	}
}
