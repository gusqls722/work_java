package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num1 = new int[10];
		int[] num2 = new int[10];
		
		for(int i=0;i<10;i++) {
			int input = scanner.nextInt();
			if(input >=100) {
				if(input <= 0 || input >= 10000 ) {
					num1[i]=100;
				}else {
					num1[i]=input;
				}
			}else {
				if(input <= 0 || input >= 10000 ) {
					num2[i]=100;
				}else {
					num2[i]=input;
				}
			}
		}	
		for(int i=0; i<num1.length;i++) {
			if(num1[i] ==0) {
				num1[i] = 10000;
			}
		}	
		for(int i=0;i<num1.length-1;i++) {
			if(num1[i] < num1[i+1]) {
				int tmp = num1[i];
				num1[i] = num1[i+1];
				num1[i+1] = tmp;
			}	
		}		
		for(int i=0;i<num2.length-1;i++) {
			if(num2[i] > num2[i+1]) {
				int tmp = num2[i];
				num2[i]	= num2[i+1];
				num2[i+1] = tmp;
			}
		}
		System.out.printf("%d %d", num2[9], num1[9]);
	}
}
