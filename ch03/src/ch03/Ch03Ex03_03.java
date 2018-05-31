package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.next();
		String input2 = scanner.next();
		String input3 = scanner.next();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		
		// 3개의 값을 더한후 실수로 변환하여 3으로 나눈 후 출력
		System.out.printf("%.1f", (float)(num1+num2+num3)/3);
	}
}
