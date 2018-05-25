package ch02;
import java.util.Scanner;
public class Ch02Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1= scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		String input2= scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		String input3= scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		
		System.out.printf("sum = %d%navg = %d", num1+num2+num3,(num1+num2+num3)/3);
	}
}
