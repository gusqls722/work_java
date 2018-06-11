package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Base = ");
			String input1 = scanner.nextLine();
			int base = Integer.parseInt(input1);
			
			System.out.print("Height = ");
			String input2 = scanner.nextLine();
			int height = Integer.parseInt(input2);
			
			System.out.printf("Triangle = %.1f%n",(base * height) /(float)2);
			
			System.out.print("Continue? ");
			String input3 = scanner.nextLine();
			if(!(input3.equals("Y") || input3.equals("y"))) {
				break;
			}
		}
	}
}
