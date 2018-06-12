package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(" ");
		
		int num1,num2,num3;
		num1 = Integer.parseInt(input[0]);
		num2 = Integer.parseInt(input[1]);
		num3 = Integer.parseInt(input[2]);
		
		/*if(num1<=num2) {
			if(num1<=num3) {
				System.out.println(num1);
			}else if(num1>=num3){
				System.out.println(num3);
			}
		}else if(num1>=num2) {
			if(num2<=num3) {
				System.out.println(num2);
			}else if(num2>=num3){
				System.out.println(num3);
			}
		}*/
		
		//삼항 연산자를 사용
		// 2. 조건연산자(삼항연산자)를 이용하여 첫번쨰와 두번쨰 수 비교
		int min01 = num1 < num2 ? num1 : num2;
		
		// 3. 조건연산자(삼항연산자)를 이용하여 2번에서 작은 수와 세번째 수 비교
		int min02 = min01 < num3 ? min01 : num3;
		
		System.out.println(min02);
	}
}
