package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int odd=0, even=0;
		do {
			int num = scanner.nextInt();
			if(num==0) {
				break;
			}
			if(num%2!=0) {
				odd++;
			}else {
				even++;
			}
		}while(true);
		System.out.println("odd:"+odd);
		System.out.println("even:"+even);
	}
}
