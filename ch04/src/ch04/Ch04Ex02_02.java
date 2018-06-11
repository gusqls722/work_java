package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		while(!(num>0 && num<=100)) {
			System.out.println("양의 정수만 입력하세요");
			num = scanner.nextInt();
		}
		int i = 1, sum=0;
		while(i<=num) {
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
	}
}
