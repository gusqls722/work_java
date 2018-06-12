package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if( 1<=num && 12>=num) {
			if(num==2) {
				System.out.println("28");
			}else if(num%2!=0)
				System.out.println("30");
			else if(num%2==0) {
				System.out.println("31");
			}
		}
		}
	}

