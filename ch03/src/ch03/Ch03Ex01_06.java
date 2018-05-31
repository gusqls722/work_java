package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		boolean result1 = num1!=0;
		boolean result2 = num2!=0;
		
		System.out.printf("%b ", result1 && result2);
		System.out.printf("%b", result1 || result2);
	}
}
