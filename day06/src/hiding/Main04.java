package hiding;

/* 11시 5분
 * 게시판 작성할 클래스
 * 	- 별도의 게시판 작성을 위한 클래스생성
 *  - 글 번호, 글 제목, 글 내용, 작성자, 조회수, 작성일시(String)
 *  - getter, setter 전체 생성
 *  - 파라미터가 있는 생성자 생성(필드값 전체를 파라미터로 받아온다)
 * Main04
 *  - 게시판 클래스로 객체생성 -> getter 전체 값 출력
 */

public class Main04 {

	public static void main(String[] args) {
		Article  at = new Article(1, 
				"게시물1", "자바 게시판", "자바학생", 
				123, "2023-01-03");
		
		System.out.println(at.getSeq());
		System.out.println(at.getSubejct());
		System.out.println(at.getContent());
		System.out.println(at.getWriter());
		System.out.println(at.getHit());
		System.out.println(at.getRegDate());
		
		
	}

}







