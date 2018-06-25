package ch05;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		char[] arr = new char[10];
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = input[i].charAt(0);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i==9) {
				continue;
			}
			if(i%3==0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
