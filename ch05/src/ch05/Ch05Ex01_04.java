package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr =new int[100];
		int i=0;
		for(i=0;i<arr.length;i++) {
			String num = scanner.nextLine();
			arr[i] = Integer.parseInt(num);
			if(arr[i]==0) 
				break;
		}
		for(i=i-1;i>=0;i--) {
			
			System.out.printf("%d ",arr[i]);
		}
		
		
	}
}
