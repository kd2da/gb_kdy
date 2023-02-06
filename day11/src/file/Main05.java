package file;

import study.java.helper.FileHelper2;

public class Main05 {
    public static void main(String[] args) {
        String encType = "UTF-8";
        String filePath = "myfile.txt";
        String content = "안녕하세요. 자바 프로그래밍 ";
        
        boolean result = FileHelper2.getInstance().writeString(
        		filePath, content, encType);
        
        if (!result) {
        	System.out.println("파일 저장에 실패했습니다.");
        	return;
        }
        
        String read = FileHelper2.getInstance().readString(filePath, encType);
        System.out.println(read);
    }
}
