package com.it.study.helper;

/*
 * 기본적인 공통 기능들을 묶어 놓은 클래스
 */

public class Util {
	
	/*
	 * 싱글톤 패턴으로 구현
	 */
	
	// 싱글톤 객체 생성 시작
	
	
	// static 으로 변수 선언하여 한번의 new 로 메모리 낭비 방지하기 위함
	private static Util current;
	
	public static Util getInstance() {
		if(current == null) {
			current = new Util();
		}
		return current;
	}


	
	// 메모리 관리를 위한 메소드 생성
	public static void freeInstance() {
		current = null;
	}
	
	// 생성자를 private 로 선언하여 외부에서 객체 불가능
	private Util() {}
	
	// 싱글톤 객체 생성 종료
	
	
	public int random(int min, int max) {
		int num
			= (int) (Math.random() * (max - min + 1) + min);
		return num;
	}
}
