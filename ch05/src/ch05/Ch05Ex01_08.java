package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0, ave=0;
		double count=0.0;
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
			if((i+1)%2==0) {
				sum+=num[i];
			}else{
				ave+=num[i];
				count++;
			}
		}
		System.out.printf("sum: %d %navg: %.1f", sum, ave/count);
	}
}
