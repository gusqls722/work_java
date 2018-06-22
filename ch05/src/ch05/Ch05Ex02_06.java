package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] arr = {'A','P','P','L','E','!'};
		
		String input = scanner.nextLine();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input.charAt(0)) {
				System.out.print(i);
				return;
			}
		}
		System.out.println("none");
	}
}
