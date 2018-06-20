package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		char[] Arr = new char[10]; 
		int i=0;
		for(;i<Arr.length;i++) {
			Arr[i] = input[i].charAt(0);
		}
		for(i-=1;i>=0;i--) {
			System.out.printf("%s ", Arr[i]);
		}
		
	}
}
