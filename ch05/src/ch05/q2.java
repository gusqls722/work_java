package ch05;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner scanner=new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(input[i]);
			System.out.print(num[i]+ " ");
		}
	}
}
