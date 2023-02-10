package javaexam_kdy;

public class Calc {
	private String member;

	public Calc(String member) {
		super();
		this.member = member;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}
	
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	public int divide(int num1, int num2) {
		if(num2 == 0) return 0;
		else return num1 / num2;
	}

}
