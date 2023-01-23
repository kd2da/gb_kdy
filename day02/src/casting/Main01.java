package casting;

public class Main01 {

	public static void main(String[] args) {
		short s = 100;		
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println("s = " + s);
		System.out.println("s = " + i);
		System.out.println("s = " + l);
		System.out.println("s = " + f);
		System.out.println("s = " + d);
		
		System.out.println("------------------");
		
		int myage1 = 20;
		double myage2 = myage1;
		
		System.out.println("myage1 : " + myage1);
		System.out.println("myage2 : " + myage2);
		
	}

}
