package kr.or.yi.java_study_02.ch07.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main_HashMap {

	public static void main(String[] args) {
		input();
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> std = new HashMap<String, Double>();

		System.out.println("미래 장학금관리 시스템입니다.");
		String[] names = { "적당히", "나탈락", "최고조", "상당히", "고득점" };
		double[] scores = { 3.1, 2.4, 4.3, 3.9, 4.0 };
		for (int i = 0; i < 5; i++) {
			std.put(names[i], scores[i]);
		}

		System.out.print("장학생 선발 학점 기준입력 >> ");
		double check = sc.nextDouble();

		Set<String> keys = std.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("장학생 명단 : ");
		while (it.hasNext()) {
			String name = it.next();
			double score = std.get(name);

			if (check < score) {
				System.out.print(name + " ");
			}
		}
	}
}
