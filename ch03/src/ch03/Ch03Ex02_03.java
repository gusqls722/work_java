package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input1 = scanner.nextLine().split(" ");
		
		int num1 = Integer.parseInt(input1[0]);
		int num2 = Integer.parseInt(input1[1]);
		
		System.out.printf("%d %d%n", ++num1 ,num2--);
		System.out.printf("%d %d", num1, num2);
	}
}
