package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		
		}
		for(int x=n-1;x>0;x--) {
			for(int z=0;z<n-x;z++) {
				System.out.print(" ");
			}
			for(int y=0;y<x;y++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
