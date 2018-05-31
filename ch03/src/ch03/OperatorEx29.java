package ch03;

public class OperatorEx29 {
	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p =%d  \t%s%n", p, toBinaryString(p));
		System.out.printf("~p =%d \t%s%n", ~p, toBinaryString(~p));
		System.out.printf("~p+1 =%d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p =%d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		
		System.out.printf(" n =%d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n-1));
	}
	static String toBinaryString(int num) {
		String zero = "00000000000000000000000000000000"; 		// 32비트 (32개)
		String tmp = zero + Integer.toBinaryString(num);
		
		/*
		 * substring(int) 메소드
		 * 괄호 안의 int 값에 해당하는 문자부터 문자열로 잘라낸다.
		 */
		return tmp.substring(tmp.length() - 32);
	}
}
