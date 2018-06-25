package ch05;

import java.util.Scanner;

public class q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;true;i++) {
			String input = scanner.nextLine();
			if(Integer.parseInt(input)==0) {
				break;
			}else if(Integer.parseInt(input)>=100){
				return;
			}
			int num = Integer.parseInt(input);
			arr[num/10]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			System.out.printf("%d : %d\n", i, arr[i]);
		}
	}
}
