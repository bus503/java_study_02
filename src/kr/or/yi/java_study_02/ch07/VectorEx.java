package kr.or.yi.java_study_02.ch07;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println(v);
		
		v.add(2,100);
		System.out.println(v); // 0 1 2번째 자리에 100이 들어감
		
		System.out.println("벡터 내의 요소 객체 수 " + v.size());
		System.out.println("벡터의 현재 용량" + v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);// 모든 요소 정수 출력하기
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum+=n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
