package ch02;
import java.util.Scanner;

public class example0524 {
	public static void main(String[] args) {
		// 1, Scanner를 이용해서 2자리 정수를 입력받으세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("두자리 정수를 하나 입력해주세요: ");
		//String input = scanner.nextLine();
		//int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로 변환
		int num = scanner.nextInt();
		System.out.printf("두자리 정수를 하나 더 입력해주세요: ");
		int num2 = scanner.nextInt();
		/* 2. 입력받은 정수를 printf 메소드를 이용해서
		 16진수, 8진수, 10진수로 출력하세요.*/
		System.out.printf("num2=%d%n",num2);
		System.out.printf("10진수 : %d%n8진수 : %o%n16진수 : %x%n", num, num, num);

	}
}
