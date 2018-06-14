package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		/*for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				if(num==j) {
					System.out.println();
					for(int i2=num-1;i2>0;i2--) {
						for(int j2=i2;j2>0;j2--) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
			}
			System.out.println();
		}*/
		
		// [방법2]
		int i = 1;
		boolean isDesc = false;
		while(i != 0) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i==num) {
				isDesc = true;
			}
			if (!isDesc) {
				i++;
			}
			else {
				i--;
			}
		}
	}
}
