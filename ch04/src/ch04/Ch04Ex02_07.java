package ch04;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num= scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.printf("%d ",i);
		}
	}
}
