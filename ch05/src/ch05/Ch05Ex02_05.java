package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] weight = new double[6];
		double sum=0;
		for(int i=0;i<weight.length;i++) {
			String input = scanner.nextLine();
			weight[i] = Double.parseDouble(input);
			sum += weight[i];
		}
			System.out.printf("%.1f", sum/6);
	}
}
