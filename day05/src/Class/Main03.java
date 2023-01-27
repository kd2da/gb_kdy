package Class;


class HelloWorld{
	
	//전역변수
	String message;
	
	void sayHello() {
		System.out.println(message);
	}
	
	void setEng() {
		message = "Hello Java";
	}
	
	void setKor() {
		message = "안녕 자바";
	}
}

public class Main03 {

	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld();
		
		hello.sayHello();
		
		System.out.println("------------");
		
		hello.setEng();
		hello.sayHello();
		System.out.println("------------");
		
		hello.setKor();
		hello.sayHello();
	}

}
