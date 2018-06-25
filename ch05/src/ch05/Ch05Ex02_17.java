package ch05;

import java.util.Scanner;

public class Ch05Ex02_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[4][2];
		int width=0, height=0, result=0;
		
		for(int i=0;i<arr.length;i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=Integer.parseInt(input[j]);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				width += arr[i][j];
			}
			System.out.printf("%d ", width/arr[i].length);
			width=0;
		}
		System.out.println();
		
		for(int i=0;i<arr[i].length;i++) {
			for(int j=0;j<arr.length;j++) {
				height += arr[j][i];
				result += arr[j][i];
			}
			System.out.printf("%d ", height/arr.length);
			height=0;
		}
		System.out.println();
		System.out.printf("%d", result/8);
	}
}
