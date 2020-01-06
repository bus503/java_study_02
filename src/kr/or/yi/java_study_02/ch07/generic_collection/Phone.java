package kr.or.yi.java_study_02.ch07.generic_collection;

public class Phone {
	private String name;
	private String juso;
	private int phonenumber;
	
	
	public Phone(String name, String juso, int number) {
		this.name = name;
		this.juso = juso;
		this.phonenumber = number;
	}


	public String getName() {
		return name;
	}


	public String getJuso() {
		return juso;
	}


	public int getNumber() {
		return phonenumber;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setJuso(String juso) {
		this.juso = juso;
	}


	public void setNumber(int number) {
		this.phonenumber = number;
	}


	@Override
	public String toString() {
		return String.format("Phone [name=%s, juso=%s, number=%s]", name, juso, phonenumber);
	}
	
}
