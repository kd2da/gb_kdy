package Extends;

/* 12시까지 10분까지
 * - 클래스 다이어그램을 참고하여 QNAArticle, FileArticle 완성
 * 단, toString() 무시
 * - Main02 클래스에서 각각의 객체 생성 후, 
 *  setter로 할당 , 해당 내용 모두 getter 출력
 */
public class Main02 {

	public static void main(String[] args) {
		FileArticle fileA = new FileArticle();
		fileA.setNum(1);
		fileA.setTitle("파일 업로드 첫번째");
		fileA.setFilaName("java.ppt");
//		System.out.println(fileA.getNum());
//		System.out.println(fileA.getTitle());
//		System.out.println(fileA.getFilaName());
		System.out.println( fileA.toString() );
		System.out.println("-----------------");
		
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("첫번째 질문");
		qna.setAnswer("첫번째 답변");
		System.out.println(qna.toString()); 
		
	}

}








