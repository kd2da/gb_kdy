package Class;

class Article{
	int seq; 		// 글 번호
	String subject; // 글 제목
	String writer;  // 작성자
	
	// 파라미터를 갖지 않는 생성자
	Article(){
		System.out.println("파라미터를 갖지 않는 생성자");
	}
	// 파라미터를 갖는 생성자
	Article(int seq, String subject, String writer){
		System.out.println("파라미터를 갖는 생성자");
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
	
}

public class Main08 {

	public static void main(String[] args) {
		Article article1 = new Article(1, "자바연습", "자바학생");
		
		article1.print();

		Article article2 = new Article();
		article2.print();
		
	}

}
