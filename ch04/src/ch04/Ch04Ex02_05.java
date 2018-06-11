package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		while(!(num==-1)) {
			num = scanner.nextInt();
			if(num%3==0) {
				System.out.println(num/3);
			}else if(num==-1) {
				break;
			}
			
		}
	}
}
