package ch05;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int sum=0,count=0;
		double avg=0.0;
		String[] input = scanner.nextLine().split(" ");
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(input[i]);
			if(i%2==0) {
				avg+=num[i];
				count++;
			}else {
				sum+=num[i];
			}
		}
		
		System.out.printf("sum:%d \navg:%.1f", sum, avg/count);
	}
}
