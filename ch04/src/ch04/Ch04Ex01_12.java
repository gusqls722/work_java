package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if( num%400==0 || (num%4==0 && num%100!=0)) {
			System.out.println("leap year");
		}else {
			System.out.println("common year");
		}
	}
}
