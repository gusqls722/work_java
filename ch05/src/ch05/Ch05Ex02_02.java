package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int[] num = new int[5];
		String[] input = scanner.nextLine().split(" ");
		for(int i=0; i<num.length; i++) {
			num[i]=Integer.parseInt(input[i]);
		}
		
		for(int i=0;i<num.length;i++) {
			if((i+1)%2!=0) {
				sum+=num[i];
			}
		}
		System.out.println(sum);
	}
}
