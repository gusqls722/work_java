package ch02;
import java.util.Scanner;
public class Ch02Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2;
		
		String input1 = scanner.nextLine();
		num1 = Double.parseDouble(input1);
		String input2 = scanner.nextLine();
		num2 = Double.parseDouble(input2);
		
		System.out.printf("%10.2f%10.2f%10.2f",num1, num2, num1+num2);
	}
}
