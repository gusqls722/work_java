package ch02;
import java.util.Scanner;
public class Ch02Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("kor ");
		String kor = scanner.nextLine();
		int num1 = Integer.parseInt(kor);
		
		System.out.printf("mat ");
		String mat = scanner.nextLine();
		int num2 = Integer.parseInt(mat);
		
		System.out.printf("eng ");
		String eng = scanner.nextLine();
		int num3 = Integer.parseInt(eng);
		
		System.out.printf("sum %d%n", num1+num2+num3);
		System.out.printf("avg %d", (num1+num2+num3)/3);
	}
}
