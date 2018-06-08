package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(" ");
		int num = Integer.parseInt(input[0]);
		int weight = Integer.parseInt(input[1]);
		
		int obesity = weight+100-num;
		System.out.println(obesity);
		if(obesity>0) {
			System.out.println("Obesity");
		}
	}
}
