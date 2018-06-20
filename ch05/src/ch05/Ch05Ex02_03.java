package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
		String[] input = scanner.nextLine().split(" ");
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=0;i<num.length;i++) {
			
		}
	}
}
