package ch05;

import java.util.Scanner;

public class Ch05Ex02_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] farr = new int[2][3];
		int[][] sarr = new int[2][3];
		int[][] narr = new int[2][3];
		
		System.out.println("first array");
		for(int i=0;i<farr.length;i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j=0;j<farr[i].length;j++) {
				farr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		System.out.println("second array");
		for(int i=0;i<sarr.length;i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j=0;j<sarr[i].length;j++) {
				sarr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for(int i=0;i<narr.length;i++) {
			for(int j=0;j<narr[i].length;j++) {
				narr[i][j] = farr[i][j] * sarr[i][j]; 
				System.out.printf("%d ", narr[i][j]);
			}
			System.out.println();
		}
		

	}
}
