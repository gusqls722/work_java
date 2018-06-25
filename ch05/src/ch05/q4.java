package ch05;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[100];
		int i=0;
		for(i=0;i<num.length;i++) {
			String input = scanner.nextLine();
			if(Integer.parseInt(input) == 0) {
				break;
			}
			num[i] = Integer.parseInt(input);
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.print(num[j] +" ");
		}
	
		
		
	}
}
