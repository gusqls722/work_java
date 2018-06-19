package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] ave = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		
		double result=0;
		for(int i=0;i<2;i++) {
			int Class = scanner.nextInt();
			result+= ave[Class-1];
		}
			
		System.out.printf("%.1f", result);
	}
}
