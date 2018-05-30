package ch03;

public class OperatorEx23 {
	public static void main(String[] args) {
		// java 메모리 구조 그림을 통해 확인 가능
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");		// ★ "==" 는 메모리 주소 비교 ★
		
		// "abc"가 같은주소에 있음
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		
		// new String에 의해 str2의 "abc"는 다른 주소에 있음
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");	
		
		// equals 메소드 :  변수의 값과 equals 괄호 안의 값 비교
		System.out.printf("str1.equals(\"abc\" ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\" ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\" ? %b%n", str2.equals("ABC"));
		
		// equalsIgnoreCase 메소드 : 괄호안의 대소문자를 구별하지 않는다.
		System.out.printf("str2.equalsIgnoreCase(\"ABC\" ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}
