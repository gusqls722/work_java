package ch05;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] arr = new char[10];
		String[] input = scanner.nextLine().split(" ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = input[i].charAt(0);
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
