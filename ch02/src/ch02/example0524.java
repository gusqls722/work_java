package ch02;
import java.util.Scanner;

public class example0524 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("두자리 정수를 하나 입력해주세요: ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("10진수 : %d%n", num);
		System.out.printf("8진수 : %o%n", num);
		System.out.printf("16진수 : %x%n", num);
		System.out.printf("입력내용 :%d", num);
	}
}
