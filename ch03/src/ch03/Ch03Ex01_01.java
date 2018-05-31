package ch03;
import java.util.Scanner;
public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int num1 = Integer.parseInt(input) + 100;
		
		String input1 = scanner.nextLine();
		int num2 = Integer.parseInt(input1) % 10;
		
		System.out.printf("%d %d", num1, num2);
	}
}
