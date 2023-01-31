package hiding;

/* 10시까지 ~ 10분까지
 * Student class 생성
 *  - name, age 멤버변수 선언
 *  - getter, setter 생성
 * Main02 class에서
 *  - Student class 객체 생성
 *  - name, age 값 할당 및 출력
 */
class Student{
	private String name;
	private int age;
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


public class Main02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("자바학생");
		s.setAge(20);
		
		String name = s.getName();
		System.out.println(name);
		
		System.out.println(s.getAge());
		
		
	}

}









