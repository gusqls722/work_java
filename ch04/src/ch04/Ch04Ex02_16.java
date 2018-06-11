package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		char ch='A';
		int count=0;
		int i,j,z;
		for(i=1;i<=num;i++) {
			for(j=num;j>=0+i;j--) {
				System.out.print(ch++);
			}
			for(z=1;z<i;z++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}
