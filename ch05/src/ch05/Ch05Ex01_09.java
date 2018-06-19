package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = scanner.nextInt();
		}
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j] < num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp; 
				}
			}
		}
		for(int i=0;i<num.length;i++)
			System.out.printf("%d ", num[i]);
	}
}
