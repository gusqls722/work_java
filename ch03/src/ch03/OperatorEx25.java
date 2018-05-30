package ch03;

import java.util.Scanner;

// Ctrl + Shift + O 입력하면 자동 import 된다.

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.> ");
		
		// 문자열을 입력하고 엔터키를 입력하기 전까지 15번에서 멈춤
		String input = scanner.nextLine();
		
		// 입력받은 문자열에서 0번째에 해당하는 문자를 끄집어낸다.
		ch = input.charAt(0);
		
		// 끄집어 낸 문자가 '0'과 '9' 사이에 포함되는지 확인
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다. %n");
		}
		
		// 끄집어 낸 문자가 'a'과 'z' 사이 이거나 'A'와 'Z' 사이 인지 확인
		if('a' <= ch && ch <= 'z') {
			System.out.printf("입력하신 문자는 영문자(소문자)입니다. %n");
		}else if('A' <= ch && ch <= 'Z')
			System.out.printf("입력하신 문자는 영문자(대문자)입니다. %n");
	}
}
