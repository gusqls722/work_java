package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d %d%n", ++num1 ,num2--);
		System.out.printf("%d %d", num1, num2);
	}
}
