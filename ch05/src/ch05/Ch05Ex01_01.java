package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = new char[10];
		
		String[] Arr = scanner.nextLine().split(" ");
		
		for(int i=0;i<input.length;i++) {
			input[i] = Arr[i].charAt(0);
		}
		for(int i=0;i<input.length;i++) {
			System.out.printf("%s",input[i]);
		}
		
		// 연습한 거
		
	/*	String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		
		char[] result = {a.charAt(0),a.charAt(1),c.charAt(2),b.charAt(4),b.charAt(0)};
		
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]);
		}*/
	}
}
