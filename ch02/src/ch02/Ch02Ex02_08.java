package ch02;
import java.util.Scanner;
public class Ch02Ex02_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String first = scanner.nextLine();
		Float fnum = Float.parseFloat(first);
		
		String second = scanner.nextLine();
		Float snum = Float.parseFloat(second);
		
		String tchar = scanner.nextLine();

		
		System.out.printf("%.2f%n%.2f%n%s",fnum, snum , tchar);
		
		
		
	}
	
}
