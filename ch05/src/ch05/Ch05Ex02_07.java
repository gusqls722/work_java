package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max=0,min=0;
		while(true){
		String[] input = scanner.nextLine().split("\n");
		int num = Integer.parseInt(input[0]);
			if (num >= 999) {	//999 이상이면 while문 종료
				break;
			}
			if(num > max) {				// 서로 비교했을때 더 크면 max에 저장
				max = num;
			}else if(num<min){			// 작으면 min에 저장
				min = num;
			}
		}
		
		System.out.printf("max : %d \nmin : %d", max,min);
	}
}
