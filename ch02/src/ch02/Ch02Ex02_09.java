package ch02;
import java.util.Scanner;
public class Ch02Ex02_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String first = scanner.nextLine();
		float fnum = Float.parseFloat(first);
		
		String second = scanner.nextLine();
		float snum = Float.parseFloat(second);
		
		String third = scanner.nextLine();
		double tnum = Double.parseDouble(third);

		
		System.out.printf("%.3f%n%.3f%n%.3f",fnum, snum, tnum);
		
		
		
	}
	
}
