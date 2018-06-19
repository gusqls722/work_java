package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			int input = scanner.nextInt();
			if(input>1000 || input < 1) {
				System.out.println("범위를 초과했습니다.");
				break;
			}
			num[i]=input;
			
		}
		
		for(int i=0; i<num.length-1; i++) {
			if(num[i] < num[i+1]) {
				int tmp = num[i];
				num[i] = num[i+1];
				num[i+1] = tmp;
			
			}
		}
		System.out.println(num[9]);
	}
}
