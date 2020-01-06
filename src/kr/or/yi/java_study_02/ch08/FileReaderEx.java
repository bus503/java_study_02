package kr.or.yi.java_study_02.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {// JVM에게 전달해서 오류 니가 처리하라고 하는거
//		readex01();
//		readex02();

		// System.out.println(System.getProperty("user.dir"));

		String filePath = System.getProperty("user.dir") + "\\data\\department.txt";
		System.out.println(filePath);

		readFile("department.txt");
		readFile("employee.txt");
		
		
		 readFileInputStream("department.txt");
		 

	}

	private static void readFileInputStream(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);
		try(FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis, "UTF8")){
			int c;
			while((c = isr.read())!=-1){
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);

		 //트라이캐치리소스문  closable interface를 구현한 클래스만 가능
		try (FileReader fr = new FileReader(file);) { // 이 문장 끝나면 자동으로 close 출력
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			System.out.println("Encoding : " + fr.getEncoding());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private static void readex02() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Windows\\system.ini");
		int c;
		while ((c = fr.read()) != -1) {
			System.out.print((char) c);
		}
	}

	private static void readex01() {
		try {
			readex02();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 오류가 생겼습니다.");
		}
	}

}
