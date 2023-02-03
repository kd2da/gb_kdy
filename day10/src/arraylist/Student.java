package arraylist;

public class Student {
	private String std_name;
	private String std_phone;
	private String std_addr;
	
	public Student(String std_name, String std_phone, String std_addr) {
		super();
		this.std_name = std_name;
		this.std_phone = std_phone;
		this.std_addr = std_addr;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_phone() {
		return std_phone;
	}

	public void setStd_phone(String std_phone) {
		this.std_phone = std_phone;
	}

	public String getStd_addr() {
		return std_addr;
	}

	public void setStd_addr(String std_addr) {
		this.std_addr = std_addr;
	}

	@Override
	public String toString() {
		return "Student [std_name=" + std_name + ", std_phone=" + std_phone + ", std_addr=" + std_addr + "]";
	}
	
	

	
}
