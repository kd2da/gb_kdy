package collection;


// 주소록 데이터를 표현하기 위한 java beans
public class Member {
	
	private String name;
	private String phoneNo;
	
	public Member(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	

}
