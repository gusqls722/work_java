package ch05;

import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] ClsSt = new int[5][3];
		
		for(int i=1;i<ClsSt.length;i++) {
			System.out.printf("%dclass? ",i);
			String[] input = scanner.nextLine().split(" ");
			for(int j=0; j<ClsSt[i].length;j++) {
				ClsSt[i][j] = Integer.parseInt(input[j]);
			}
		}
		int result = 0;
		for(int i=1;i<ClsSt.length;i++) {
			for(int j=0; j<ClsSt[i].length;j++) {
				result += ClsSt[i][j];
			}
			System.out.printf("%dclass : %d", i, result);
			System.out.println();
			result=0;
		}
	}
}
