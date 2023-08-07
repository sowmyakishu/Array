package array;

public class TryCatchblock {

	public static void main(String[] args) {
   System.out.println("Main Begin");
	}
	try {
		int a=10;
		System.out.println(a);
		int b=0;
		System.out.println(b);
		int res= a/b;
		System.out.println(res);
	}
	TryCatchblock(RuntimeException e)
	{
		System.out.println("Exception object caught...");
	System.out.println("Main End");
    }
}
