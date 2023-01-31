package overload;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character();
		System.out.println(c.toString());
		
		c.setProperty("회사원");
		System.out.println(c.toString());
		
		c.setProperty(30);
		System.out.println(c.toString());
		
		c.setProperty(50, "교수");
		System.out.println(c.toString());
		
		c.setProperty("학생", 20);
		System.out.println(c.toString());
	}

}

















