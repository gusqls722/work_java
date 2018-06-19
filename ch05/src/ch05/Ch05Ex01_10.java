package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] arr = new char[26];
		
		for(int i=0;true;i++) {
			String[] sArr = scanner.nextLine().split("\n");
			if(!(sArr[i].charAt(0)>='A' && sArr[i].charAt(0)<='Z')) {
				break;
			}
				
			
		}
	}
}
