package ch05;

import java.util.Scanner;

public class q14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr1=new int[2][4];
		int[][] arr2=new int[2][4];
		
		System.out.println("first array");
		for(int i=0;i<arr1.length;i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = Integer.parseInt(input[j]);
			}
		}
		System.out.println("second array");
		for(int i=0;i<arr1.length;i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j=0;j<arr1[i].length;j++) {
				arr2[i][j] = Integer.parseInt(input[j]);
			}
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr2[i][j] *= arr1[i][j];
				System.out.printf("%d ",arr2[i][j]);
			}
			System.out.println();
		}
	}
}
