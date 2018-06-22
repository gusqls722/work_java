package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
		int odd=0, even=0;
		String[] input = scanner.nextLine().split(" ");
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
				odd += num[i];
			}else {
				even += num[i];
			}
			
		}
		System.out.printf("odd : %d\neven : %d ", odd, even);
	}
}
