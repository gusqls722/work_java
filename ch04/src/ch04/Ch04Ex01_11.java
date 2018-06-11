package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num==0) {
			System.out.println("zero");
		}else if(num>0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
	}
}
