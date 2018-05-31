package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		
		System.out.printf("%b ", num1 > num2 && num1 > num3);
		System.out.printf("%b", num1 == num2 && num1 == num3);
	}
}
