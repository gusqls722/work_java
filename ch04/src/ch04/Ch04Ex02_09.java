package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0,ave=0;
		do {
			int num=scanner.nextInt();
			if(num<0 || num>100) {
				break;
			}
			ave++;
			sum+=num;
		}while(true);
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",sum/(float)ave);
	}
}
