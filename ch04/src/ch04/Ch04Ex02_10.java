package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int count=0;
		do {
			int num=scanner.nextInt();
			if(!(num%3==0 || num%5==0)) {
				count++;
			}else if(num==0) {
				break;
			}
			
		}while(true);
		System.out.println(count);
	}
}
