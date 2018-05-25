package ch02;
import java.util.Scanner;
public class Ch02Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2;
		
		String input1 = scanner.nextLine();
		num1 = Integer.parseInt(input1);
		String input2 = scanner.nextLine();
		num2 = Integer.parseInt(input2);
		
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
	}
}
