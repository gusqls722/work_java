package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		for(int i=1;i<=num1;i++) {
			for(int j=1;j<=num2;j++) {
				System.out.printf("%d ",j*i);
			}
			System.out.println();
		}
		
	}
}
