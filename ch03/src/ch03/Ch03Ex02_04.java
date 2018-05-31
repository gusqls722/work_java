package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String height1 = scanner.next();
		String weight1 = scanner.next();
		String height2 = scanner.next();
		String weight2 = scanner.next();
		
		int num1 = Integer.parseInt(height1);
		int num2 = Integer.parseInt(weight1);
		int num3 = Integer.parseInt(height2);
		int num4 = Integer.parseInt(weight2);
		
		int result = num1>num3 && num2>num4 ? 1 : 0;
		System.out.printf("%d", result);
	}
}
