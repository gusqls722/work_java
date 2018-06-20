package ch05;

import java.util.Scanner;

public class Ch05Ex01_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0;
		int[] arr = new int[10];
	
		while(true) {
			String[] input = scanner.nextLine().split("\n");
			int count = Integer.parseInt(input[0]);
			if(count == 0 || count >=100) {
				break;
			}
			arr[count/10] += 1;
			i++;
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] < 1) {
				continue;
			}
			System.out.printf("%d : %d \n", j, arr[j]);
		}
	}
}
