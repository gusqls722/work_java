package ch02;
import java.util.Scanner;
public class Ch02Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String yd = scanner.nextLine();
		float ydnum = Float.parseFloat(yd);
		
		String in = scanner.nextLine();
		double innum = Double.parseDouble(in);
		
		System.out.printf("%4.1fyd = %5.1fcm%n", ydnum, ydnum*91.44);
		System.out.printf("%4.1fin = %5.1fcm%n", innum, innum*2.54);
	}
}
