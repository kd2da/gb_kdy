package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stdList = new ArrayList<Student>();
		for(int i=0; i<10; i++) {
			stdList.add(new Student("학생" + i, "휴대폰번호" + i, "주소" + i));
		}
		
		System.out.println("arrayList 의 크기 : " + stdList.size());
		System.out.println("arrayList 5번째 요소 : " + stdList.get(4));
		stdList.remove(4);
		for(Student s : stdList) {
			System.out.println(s.toString());
		}
		
	}

}
