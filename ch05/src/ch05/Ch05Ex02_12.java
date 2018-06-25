package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] stu = new int[11];
		for(int i =0;i<100;i++) {
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			if(num==0) {
				break;
			}
			int sum=num/10;
			stu[num/10]++;
		}
		
		for(int i =stu.length-1; i>0;i--) {
			if(stu[i]==0) {
				continue;
			}
			System.out.printf("%d : %d person\n", i*10 , stu[i]);
		}
	}
}
