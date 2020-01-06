package kr.or.yi.java_study_02.ch08_task;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderEx_task {

	public static void main(String[] args) {
//		q1();
//		q2();
//		q3_Main();
//		q4_Main();
//		q5_Main();
		q6_Main();
	}

	private static void q6_Main() {
		File src = new File("c:\\WIndows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("c:\\Temp\\desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);

			byte[] buf = new byte[1024 * 10];

			while (true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if (n < buf.length) {
					break;
				}
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "를 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

	private static void q5_Main() {
		File src = new File("c:\\WIndows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("c:\\Temp\\copyimg.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);

			while ((c = fi.read()) != -1) {
				fo.write((byte) c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "를 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

	private static void q4_Main() {
		File src = new File("c:\\windows\\system.ini");
		File dest = new File("c:\\Temp\\system.txt");

		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "를 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

	private static void q3_Main() {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + " , " + f1.getParent() + " , " + f1.getName());

		String res = " ";
		if (f1.isFile()) {
			res = "파일";
		} else if (f1.isDirectory()) {
			res = "디렉토리";
		}
		System.out.println(f1.getPath() + " 는 " + res + " 입니다.");

		File f2 = new File("c:\\Temp\\java_sample");
		if (!f2.exists()) {
			f2.mkdir();
		}

		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\java_sample"));
		listDirectory(new File("c:\\Temp"));

	}

	private static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + " 의 서브 리스트입니다. -----");

		File[] subFiles = dir.listFiles();

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.println(f.getName());
			System.out.println("\t파일 크기 : " + f.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	private static void q2() {

		File file = new File("C:\\windows\\", "system.ini");

		if (file.isFile() == true) {
			System.out.println(file.isFile() + " 일반 파일입니다.");
		} else {
			System.out.println("일반 파일이 아닙니다.");
		}

		System.out.println("부모 디렉터리의 이름은 " + file.getParent() + " 입니다.");
		System.out.println("경로명은 문자열로 " + file.getPath() + " 입니다.");
		System.out.println("파일명은 " + file.getName() + " 입니다.");

	}

	private static void q1() {
		FileReader fin = null;
		int c;
		try (BufferedOutputStream out = new BufferedOutputStream(System.out, 5);) {
			fin = new FileReader("C:\\Temp\\test2.txt");
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
