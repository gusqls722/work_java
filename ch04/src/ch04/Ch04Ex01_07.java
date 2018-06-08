package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		char ch = input.charAt(0);
		if(ch=='A') {
		System.out.println("Excellent");
		}else if(ch=='B') {
			System.out.println("Good");
		}else if(ch=='C') {
			System.out.println("Usually");
		}else if(ch=='D') {
			System.out.println("Effort");
		}else if(ch=='F') {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
		
	}
}
