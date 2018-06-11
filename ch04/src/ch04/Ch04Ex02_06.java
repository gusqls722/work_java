package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do{
		System.out.printf("1. Korea%n2. USA%n3. Japan%n4. China%n");
		System.out.print("number? ");
		int num = scanner.nextInt();
		if(num==1) {
			System.out.println();
			System.out.println("Seoul");
		}else if(num==2) {
			System.out.println();
			System.out.println("Washington");
		}else if(num==3) {
			System.out.println();
			System.out.println("Tokyo");
		}else if(num==4) {
			System.out.println();
			System.out.println("Beijing");
		}else {
			System.out.println();
			System.out.println("none");
			break;
		}
		}while(true);
	}
}
