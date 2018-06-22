package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int i=0;
		for(i=0; i<num.length;i++) {
			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			if ( num[i] == -1) {
				break;
			}
		}
		
 	// 배열에 넣은 최대 순서값 에서 -3을 뺀 값을 j에 저장 (-1은 제외하고 3번 출력)
		for(int j=i-3; j<i; j++) {
			System.out.printf("%d ",num[j]);
		}
		
		
	}
}
