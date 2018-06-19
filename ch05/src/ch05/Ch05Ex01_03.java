package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] Arr = scanner.nextLine().split(" ");
		char[] chArr = new char[10];
		for(int i=0; i<chArr.length; i++) {
			chArr[i] = Arr[i].charAt(0);
		}
		
		for(int i=0; i<chArr.length; i++) {
			if(i%3==0 && i!=9) {
				System.out.printf("%s ", chArr[i]);
			}
		}
	}
}
