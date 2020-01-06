package kr.or.yi.java_study_02.ch07.exam03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
//		exam1();
		
		//put가 중복되는 경우 value 값 리턴되고 추가된 경우 null을 리턴한다.
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		//해시맵을 생성
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		//Set <k> keySet() 해시맵의 모든 키를 담은 Set<key> 컬렉션 리턴
		Iterator<String> it = keys.iterator();
		//출력을 위한 Iterator객체 얻기
		
		while(it.hasNext()) {
			String name = it.next(); 
			//it이 가리키는 요소를 리턴. it의 요소타입이 스트링이므로 문자열을 리턴
			int score = scoreMap.get(name);
			//V get(object key)  지정된 키의 값을 리턴, 키가 없으면 null을 리턴해준다
			System.out.println(name + " : " + score);
		}
	}

	private static void exam1() {
		HashMap<String,String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println(eng + "없는 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}
		
		sc.close();
	}
}
