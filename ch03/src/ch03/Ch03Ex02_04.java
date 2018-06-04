package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] height1 = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(height1[0]);
		int num2 = Integer.parseInt(height1[1]);
		
		String[] height2 = scanner.nextLine().split(" ");
		int num3 = Integer.parseInt(height2[0]);
		int num4 = Integer.parseInt(height2[1]);
		
		int result = num1>num3 && num2>num4 ? 1 : 0;
		System.out.printf("%d", result);
	}
}
