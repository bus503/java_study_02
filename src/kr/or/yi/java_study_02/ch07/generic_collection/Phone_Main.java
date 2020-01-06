package kr.or.yi.java_study_02.ch07.generic_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Phone_Main {

	public static void main(String[] args) {
		//전화번호 관리 프로그램.
		//하나의 전화번호 정보를 phone클래스를 통해 표현하고 하나의 전화번호 정보는 이름, 주소, 전화번호로 구성된다
		//동일한 이름을 가진 사람이 입력되지 않도록 한다
		//메뉴는 삽입, 삭제, 찾기 , 전체보기, 종료 5가지이다.
		HashMap<String,String,Integer> phone1 = new HashMap<String,String,Integer>();
		Scanner sc = new Scanner (System.in);
		int result;
		do {System.out.println("1.삽입, 2.삭제, 3.찾기, 4.전체보기, 5.종료");
			result = sc.nextInt();
			switch (result) {
			case 1:
				System.out.println("전화번호 정보 삽입");
				break;
			case 2:
				System.out.println("전화번호 정보 삭제");
				break;
			case 3:
				System.out.println("전화번호 정보 찾기");
				break;
			case 4:
				System.out.println("전체 목록보기");
				break;
			}
		}while(result<5);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
