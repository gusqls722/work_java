package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(" ");
		
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		
		if(num1>num2) {
			System.out.println(num1-num2);
		}else if(num2>num1) {
			System.out.println(num2-num1);
		}else {
			System.out.println(0);
		}
		
		// 번외 : 메소드 이용해서 구하는 방법
		// Math.abs() : 절대값 리턴하는 메소드
		// System.out.println(Math.abs(num1-num2));
	}
}
