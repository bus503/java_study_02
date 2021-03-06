package kr.or.yi.java_study_02.ch07;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector <Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		System.out.println(v);
		
		v.remove(1);
		
		//벡터에 있는 point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
		//해결하시오.
		System.out.println(v.contains(new Point(30,-8)));
		System.out.println(v.indexOf(new Point(30,-8)));
		v.remove(new Point(30,-8));
		System.out.println(v);
	}
}
