package study.java.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHelper {
	// 싱글톤 객체 생성 시작
	private static FileHelper current;
	
	public static FileHelper getInstance() {
		if(current == null) {
			current = new FileHelper();
		}
		return current;
	}
	
	public static void freeInstance() {
		current = null;
	}
	private FileHelper() {}
	
	// 싱글톤 객체 생성 끝
	
	/*
	 * 주어진 경로 data 값을 기록하고 저장한다.
	 * @param	filePath	- 저장할 파일 경로
	 * @param	data		- 저장할 내용을 담을 스트림
	 * @return 	boolean		- 성공시 true, 실패시 false
	 */
	
	public boolean write(String filePath, byte[] data) {
		boolean result = false;
		
		OutputStream out = null;
		try {
			out = new FileOutputStream(filePath);
			out.write(data);
			result = true;
			System.out.println("[INFO] 파일 쓰기 성공 >> " + filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 잘못된 경로 입니다. >> " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 파일 쓰기 실패 >> " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] 알 수 없는 에러>> " + filePath);
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// OutputStream 결과가 실행
		return result;
	}
	
	/*
	 * 주어진 경로의 파일을 읽고, 내용을 스트림으로 리턴한다.
	 * @param		filePath	- 읽어야할 파일의 경로
	 * @return		byte[] 		- 읽혀진 내용
	 */
	public byte[] read(String filePath) {
		
		byte[] data = null;
		InputStream in = null;
		// FileInputStream
		try {
			in = new FileInputStream(filePath);
			data = new byte[in.available()];
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >> " + filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 잘못된 경로 입니다. >> " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 파일 읽기 실패 >> " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}
	
}


/*
 * [INFO] 파일 저장 성공 >> myfile.txt
 * [INFO] 파일 읽기 성공 >> myfile.txt
 * 안녕하세요. 자바 프로그래밍
 * 
 * - 프로젝트 경로에 myfile.txt 생성 후
 * "안녕하세요. 자바 프로그래밍" 문자열 출력 확인 필수
 */