package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input1 = scanner.nextLine().split(" ");
		
		int width = Integer.parseInt(input1[0]) + 5;
		int length = Integer.parseInt(input1[1]) * 2;
		
		System.out.println("width = " + width);
		System.out.println("length=" + length);
		System.out.printf("area = %d", width * length);
	}
}
