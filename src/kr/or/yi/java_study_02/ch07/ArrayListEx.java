package kr.or.yi.java_study_02.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); 
		//ArrayList<Object> arr = new ArrayList<>();
		//이런식으로 선언하는것과 똑같은데 이렇게 하는거보다 제네릭을 쓰는게더 낫다
		
		List<Integer> arList = new ArrayList<>();
		//컬렉션에서 List는 ArrayList의 부모이기 때문에 이렇게도 쓸수있음
		arList.add(5);
		arList.add(3);
		arList.add(4);
		arList.add(1);
		
		for(int i=0; i<arList.size(); i++) {
			System.out.println(arList.get(i));
		}
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("이상원");
		strList.add("황태원");
		strList.add("권수진");
		strList.add("이상원");
		
		String[] a = new String[strList.size()];
		System.out.println(Arrays.toString(a));// 처음은 널이었다가
		strList.toArray(a); // 모든 요소를 포함하는 배열을 리턴
		System.out.println(Arrays.toString(a));
		
		
		
		for(String name: strList) {
			System.out.println(name);
		}
		if(strList.contains("장현서")){
			System.out.println("포함");
		}else {
			System.out.println("미포함");
		}
		
		int findIdx = strList.indexOf("장현서");
		System.out.println(findIdx); 
		//없으면 -1을 리턴
		
		int findIdx2 = strList.lastIndexOf("이상원");
		System.out.println(findIdx2); 
		//뒤에서부터 찾아서 값을 리턴해줌
		
		System.out.println(strList.isEmpty());
		
		strList.remove("이상원");
		System.out.println(strList); 

//		strList.clear();
//		System.out.println(strList.isEmpty());
//		System.out.println(strList);
//		addList(arList);
//		for(int i=0; i<arList.size(); i++) {
//			int a = arList.get(i);
//			System.out.println(a);
//		}
		
	}

	private static void addList() {
		List<Integer> arList = new ArrayList<>();
		System.out.println("arList.size() : "  + arList.size());
//		System.out.println(arList));
		
		//추가
		arList.add(5);
		System.out.println("arList.size() : "  + arList.size());
		for(int i=0; i<10; i++) {
			arList.add(i);
			//i는 인트지만 자동 언박싱되어서 들어감
		}
		System.out.println("arList.size() : "  + arList.size());
		System.out.println(arList);
		
		arList.add(1,10);
		System.out.println(arList);
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(20);
		subList.add(21);
		subList.add(22);
		
		arList.addAll(subList);
		System.out.println(arList);
	}
}
