package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num<0) {
			System.out.println(num);
			System.out.println("minus");
		}else {
			System.out.println(num);
		}
	}
}
