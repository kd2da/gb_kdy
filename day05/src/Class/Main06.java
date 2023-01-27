package Class;

class Member {
	String name;
	int age;
		
	/*
	 * name, age 의 멤버변수를 
	 * 메소드를 통해서 간접적으로 할당하고 있다.
	 */
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	void say() {
		// 메서드 접근할 때에는 this 키워드를 사용하는 것이 필수는 아닌다.
		System.out.println(this.getName());
		System.out.println(getAge());
	}
}

public class Main06 {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.name = "고대열"; // 가독성 떨이지고, 일반적인 처리 방식이 아니다
		member.setName("고대열");
		member.setAge(35);
		member.say();
	}

}
