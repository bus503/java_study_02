package kr.or.yi.java_study_02.ch07.generic;

import java.util.ArrayList;

public interface DaoInterface<T> {
	
	public boolean insertItem(T item);
	
	public boolean deleteStudent(T item);
	
	public ArrayList<T> listStudent();
	
	public boolean updateStudent(T item);
	
	public T searchStudent(T item);
	
}
