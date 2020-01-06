package kr.or.yi.java_study_02.ch06;

public class WrapperEx {

	public static void main(String[] args) {
//		do_wrapper();
//		do_wrapper2();
		do_string();
		
		
		
		
	}




	private static void do_string() {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");  //문자열 덧붙이기
		System.out.println(sb);
		
		sb.insert(7 ," my");	//문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // my를 your로 변경
		System.out.println(sb);
		
		sb.delete(8, 13);  //"your" 삭제
		System.out.println(sb);
		
		sb.setLength(4);  //스트링버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}




	private static void do_wrapper2() {
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4';
		char c2 = 'F';
		
		if(Character.isDigit(c1)) { //문자 c1이 숫자이면 true
			System.out.println(c1+"는 숫자");
		}
		if(Character.isAlphabetic(c2)) { //문자 c2이 영문자이면 true
			System.out.println(c2+"는 영문자");
		}
		
		System.out.println(Integer.parseInt("-123")); //10진수로 변환
		System.out.println(Integer.toHexString(28)); //2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); //16진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 2진수의 1의 개수
		
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); //double를 문자열 3.14로 변환
		System.out.println(Double.parseDouble("3.14"));// 문자열을 실수 3.14로 변환 
		
		boolean b = (4>3); //b는 트루
		System.out.println(Boolean.toString(b));// 트루를 문자열 트루로 변환
		System.out.println(Boolean.parseBoolean("false"));// 문자열을 펄스로 변환
		
		String str02 = "bc";
		String str01 = "dc";
		
	
		System.out.println(str02.compareTo(str01));//사전상 2에 1을 비교햇을때 2가 98 1이 100이니까 -2가 나옴
	}
	
	
	

	private static void do_wrapper() {
		Integer i = 31; //autoboxing
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");
		//4가지가 전부 같은 의미
		System.out.printf("%d %d %d %d %n", i , i2, i3, i4);
		
		
		
		System.out.println(Integer.bitCount(10));
		//괄호 안을 이진수로 변환 후 1의 개수
		System.out.println(Integer.toHexString(31));
		//괄호 안을 16진수 변환 후 문자열 리턴
		System.out.println(Integer.toBinaryString(31));
		//괄호안 숫자를 이진수로 변환후 문자열 리턴
		System.out.println(Integer.toOctalString(31));
		//괄호안 숫자를 8진수로 변환후 문자열 리턴
		System.out.println("++++++++++++++++++++++++");
		System.out.println(i2.floatValue());
		System.out.println(i2.doubleValue());

		String str = i2.toString();
		System.out.println(str);
	}
}
