package hiding;

public class Article {

	private int seq;		// 글 번호
	private String subejct;	// 글 제목
	private String content;	// 글 내용
	private String writer;	// 작성자
	private int hit;		// 조회수
	private String regDate;	// 작성일자
	
	public Article(int seq, String subejct, 
			String content, String writer, 
			int hit, String regDate) {
		this.seq = seq;
		this.subejct = subejct;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSubejct() {
		return subejct;
	}

	public void setSubejct(String subejct) {
		this.subejct = subejct;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
	
	
	
	
	
}





