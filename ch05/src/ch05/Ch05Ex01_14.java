package ch05;

import java.util.Scanner;

public class Ch05Ex01_14 {
	public static void main(String[] args) {

		// 1.입력받아 저장할 배열 2개 생성 (2행 4열)
		int[][] num1 = new int[2][4];
		int[][] num2 = new int[2][4];
		
		System.out.println("first array");
		for (int j=0; j< num1.length; j++) {
			// 2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 num? 배열에 저장하기
			for (int i=0; i<numbers.length;i++) {
				num1[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		System.out.println("second array");
		for (int j=0; j< num2.length; j++) {
			// 2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 num? 배열에 저장하기
			for (int i=0; i<numbers.length;i++) {
				num2[j][i] = Integer.parseInt(numbers[i]);
			}
		}	
		
		// 4. 출력하기
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1[i].length;j++) {
				System.out.print(num1[i][j] * num2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
