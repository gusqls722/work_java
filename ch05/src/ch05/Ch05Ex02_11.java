package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ArrN = new int[6];
		int count=0;
		String[] input = scanner.nextLine().split(" ");
		for(int i=0;i<10;i++) {
			int num = Integer.parseInt(input[i]);
			if(num>6 || num<1) {
				return;
			}
			ArrN[num-1]++;
		}
		
		for(int i=0;i<ArrN.length;i++) {
			System.out.printf("%d : %d\n", i+1, ArrN[i]);
		}
		
	}
}
