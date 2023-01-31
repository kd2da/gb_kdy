package Extends;

public class FileArticle extends Article {

	private String filaName;

	public String getFilaName() {
		return filaName;
	}

	public void setFilaName(String filaName) {
		this.filaName = filaName;
	}
	
	public String toString() {
		return "자료실[번호 = " + getNum() 
				+ ", 제목 = " + getTitle()
				+ ", 첨부파일 = " + getFilaName();
	}
	
	
	
}










