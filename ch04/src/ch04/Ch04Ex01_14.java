package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num%2!=0) {
			System.out.println("31");
		}else {
			if(num==2) {
				System.out.println("28");
			}else
			System.out.println("30");
		}
	}
}
