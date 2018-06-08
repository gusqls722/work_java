package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		String input12 = scanner.next();
		
		char ch = input.charAt(0);
		int age = Integer.parseInt(input12);
		
		if(ch=='M') {
			if(age>=18) {
				System.out.println("MAN");
			}else {
				System.out.println("BOY");
			}
		}else{
			if(age>=18) {
				System.out.println("WOMAN");
			}else {
				System.out.println("GIRL");
			}
		}
	}
}
