package ch05;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] ave = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int[] num = new int[2];
		double sum=0;
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(scanner.nextLine());
			
			sum += ave[num[i]-1];
		}
		System.out.print(sum);
		
	}
}
