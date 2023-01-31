package boxing;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 객체 형변환 + 객체 배열 사용
		 * AirForce 공군 부대 2
		 * Navy 	해군 부대 1
		 * Army 	육군 부대 2
		 * for문 사용, attack() -> 부대 일괄 공격
		 */
		// 객체 배열 생성
		Unit[] unit = new Unit[5];
		
		//암묵적 형변환 (override 된 기능(메소드)만 사용 가능)
		unit[0] = new AirForce("공군A");
		unit[1] = new AirForce("공군B");
		unit[2] = new Navy("해군A");
		unit[3] = new Army("육군A");
		unit[4] = new Army("육군B");
		
		
		System.out.println("전 부대 일괄 공격!!!");
		for(int i = 0; i<unit.length; i++) {
			unit[i].attack();
		}
		
		System.out.println("=====================");
		
		// 객체 instanceof 클래스 - 해당 연산자를 통해
		// 명시적 형변환 하여
		// 각각의 객체의 독립적인 기능 메서드 호출
		for(int i = 0; i<unit.length; i++) {
			if(unit[i] instanceof Army) {
				//지역 변수 am 선언
				Army am = (Army) unit[i];
				am.tank();
			} else if (unit[i] instanceof Navy) {
				Navy nv = (Navy) unit[i];
				nv.nucleus();
			} else if (unit[i] instanceof AirForce) {
				AirForce af = (AirForce) unit[i];
				af.bombing();
			}
		}
		//명시적 형변환 (override 외 기능(메소드)도 사용 가능해짐)
	
		
	}

}
