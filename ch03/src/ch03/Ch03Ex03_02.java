package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.next();
		String input2 = scanner.next();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d ", num1/num2);	// 두 수를 나눈 값 출력
		System.out.printf("%.2f", (double)num1/num2);	// 첫번쨰 값을 실수로 변환 후 나눈 값 출력
	}
}
