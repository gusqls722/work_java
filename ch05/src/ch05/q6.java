package ch05;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		String[] input = scanner.nextLine().split(" ");
		
		for(int i=0;i<num.length;i++) {
			num[i]=Integer.parseInt(input[i]);
		}
		for(int i=0;i<num.length-1;i++) {
			if(num[i]<num[i+1]) {
				int tmp = num[i];
				num[i] = num[i+1];
				num[i+1] = tmp;
			}
		}
		System.out.printf("%d", num[num.length-1]);
	}
}
