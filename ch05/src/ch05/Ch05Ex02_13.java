package ch05;

import java.util.Scanner;

public class Ch05Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num=new int[10];
		String[] input = scanner.nextLine().split(" ");
		for(int i=0;i<2;i++) {
			num[i] = Integer.parseInt(input[i]);
			if(num[i]>=10 || num[i] <= 0) {
				return;
			}
		}
		
		for(int i=2;i<num.length;i++) {
			num[i]=num[i-2]+num[i-1];
			if(num[i] >= 10) {
				num[i]-=10;
			}
		}
		
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i] +"\n");
		}
		
	}
}
