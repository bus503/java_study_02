package kr.or.yi.java_study_02.ch07.generic_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex11_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet<Integer> set = new HashSet<>(list);
		TreeSet<Integer> tset = new TreeSet<>(set);
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}

	}

}
