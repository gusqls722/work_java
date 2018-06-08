package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		if(age>=20) {
			System.out.println("adult");
		}else {
			System.out.println((20-age)+" years later");
		}
	}
}
