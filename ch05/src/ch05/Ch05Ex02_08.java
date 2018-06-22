package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int count=0, sum=0;
		for(int i=0;i<num.length;i++) {
			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			if(num[i]==0) {
				break;
			}
			
			if(num[i]%5==0) {
				count++;
				sum+=num[i];
			}
		}
		System.out.printf("Multiples of 5 : %d\n", count);
		System.out.printf("sum : %d \navg : %.1f", sum, sum/(double)count);
		
		
	}
}
