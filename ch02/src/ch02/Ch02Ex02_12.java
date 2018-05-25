package ch02;
import java.util.Scanner;
public class Ch02Ex02_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		String input1= scanner.nextLine();
		num1 = Integer.parseInt(input1);
		
		double num2;
		String input2 = scanner.nextLine();
		num2 = Double.parseDouble(input2);
		
		System.out.printf("%.2f * %d = %.0f", num2, num1, num2*num1);
	}
}
