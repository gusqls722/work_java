package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();
		String input3 = scanner.next();
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		double num3 = Double.parseDouble(input3);
		
		System.out.printf("sum %d%n", (int)num1+(int)num2+(int)num3); // 정수 변환 후 총점 더하고 출력
		System.out.printf("avg %d", (int)((num1+num2+num3)/3));	// 평균 구한 후 정수로 변환하여 출력
	}
}
