package ch03;

public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;	// 1000000 * 1000000 / 1000000
		/*long result1 = (long)a * a / a;
		 * 순서를 바꾸기 싫다면 롱타입으로 위처럼 형변환시킨다
		 */
		int result2 = a / a * a;	// 1000000 * 1000000 / 1000000
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}
}
