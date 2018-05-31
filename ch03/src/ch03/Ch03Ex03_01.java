package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.next();
		String input2 = scanner.next();
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		
		System.out.printf("%d ", (int)(num1*num2));	//  두 수의 곱을 정수로 변환 후 출력
		System.out.printf("%d", (int)num1*(int)num2);	// 두 수를 정수로 변환하여 곱한 후 출력
	}
}
