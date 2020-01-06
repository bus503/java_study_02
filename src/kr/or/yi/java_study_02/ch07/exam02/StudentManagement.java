package kr.or.yi.java_study_02.ch07.exam02;

import java.util.ArrayList;


public class StudentManagement implements StdManagerInterface {
	private ArrayList<Student> stdList;
	
	public StudentManagement() {
		this.stdList = new ArrayList<Student>();
	}

	public boolean insertStudent(Student student) {
		return stdList.add(student);
	}

	public boolean deleteStudent(Student student) {
		if (stdList.contains(student)) {
			return stdList.remove(student);
		}
		return false;
	}

	public ArrayList<Student> listStudent() {
		return this.stdList ;
	}

	public boolean updateStudent(Student student) {
		Student std = stdList.set(stdList.indexOf(student), student);
		return std!=null;
	}

	public Student searchStudent(Student student) {
		if (!stdList.contains(student)) {
			return null;
		}
		return stdList.get(stdList.indexOf(student));
	}

	public void setStudentList(ArrayList<Student> initStdList) {
		this.stdList = initStdList;
	}

}
