package file;

import java.io.UnsupportedEncodingException;

import study.java.helper.FileHelper;

public class Main04 {

	public static void main(String[] args) {
		FileHelper fh = FileHelper.getInstance();
		
		String encType = "UTF-8";
		String filePath = "myfile.txt";
		String write_string = "안녕하세요. 자바 프로그래밍";  
		byte[] write_byte = write_string.getBytes();
		
		boolean result = fh.write(filePath, write_byte);
		
		if(!result) {
			System.out.println("파일 저장에 실패했습니다.");
			return;
		}
		
		String read_string = null;
		try {
			read_string = new String(fh.read(filePath),encType);
			System.out.println(read_string);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
