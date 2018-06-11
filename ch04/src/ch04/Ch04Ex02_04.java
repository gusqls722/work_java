package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0,sum=0,ave=0;
		do {
			num = scanner.nextInt();
			if(num>100) {
				break;
			}
			sum+=num;
			ave++;
		}while(true);
		System.out.println(sum);
		System.out.printf("%.1f",sum/(double)ave);
	}
}
