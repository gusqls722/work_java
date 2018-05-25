package ch02;
import java.util.Scanner;
public class Ch02Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int num1 = Integer.parseInt(input);
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d%n%d",num1,num2);
		
		
	}
}

