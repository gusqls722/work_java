package ch02;
import java.util.Scanner;
public class Ch02Ex02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("height = ");
		String height = scanner.nextLine();
		int heightnum = Integer.parseInt(height);
		
		System.out.printf("Your height is %dcm",heightnum);
	}
}
