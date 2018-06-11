package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1=0,num2=0;
		do {
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		}while( !((num1>=2 && num1<=9) || (num2>=2&&num2<=9)));
		
		for(int i=1;i<=9;i++) {
			if(num1>=num2) {
				for(int j=num1; j>=num2;j--) {
					System.out.printf("%d * %d = %3d  ",j, i, j*i);
				}
			}else {
				for(int j=num1; j<=num2;j++) {
					System.out.printf("%d * %d = %3d  ",j, i, j*i);
				}
			}
			System.out.println();
		}
			
			
	}
}
