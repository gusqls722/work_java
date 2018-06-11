package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int i,j,z;
		int count=1;
		for(i=0;i<n;i++) {
			for(z=1;z<i+1;z++) {
				System.out.print(" ");
			}
			for(j=1;j<=n-i;j++) {
				System.out.print(count++%10);
			}
			System.out.println();
		}
	}
}
