package Class;

public class Main01 {

	public static void main(String[] args) {
		// 객체의 선언과 할당 분리
		Student std1;
		std1 = new Student();
		
		// 객체의 선언과 할당 일괄지정
		Student std2 = new Student();
		
		System.out.println("std1 이름 : " + std1.name);
		System.out.println("std1 나이 : " + std1.age);
		System.out.println("std1 전화번호 : " + std1.number);
		
		System.out.println("std2 이름 : " + std2.name);
		System.out.println("std2 나이 : " + std2.age);
		System.out.println("std2 전화번호 : " + std2.number);
		System.out.println("---------------------");
		
		std1.name = "홍길동";
		std1.age = 30;
		
		System.out.println("std1 이름 : " + std1.name);
		System.out.println("std1 나이 : " + std1.age);
		
		System.out.println("std2 이름 : " + std2.name);
		System.out.println("std2 나이 : " + std2.age);
		System.out.println("---------------------");
		
		std2.name = "이순신";
		std2.age = 25;
		
		System.out.println("std1 이름 : " + std1.name);
		System.out.println("std1 나이 : " + std1.age);
		
		System.out.println("std2 이름 : " + std2.name);
		System.out.println("std2 나이 : " + std2.age);
		System.out.println("---------------------");
	}

}

// 학생 정보를 포함하는 클래스 작성
class Student {
	// 멤버변수
	String name;
	int age;
	String number;
}

