package ch02;
import java.util.Scanner;
public class Ch02Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("yard? ");
		String yd = scanner.nextLine();
		double ydnum = Double.parseDouble(yd);
		
		System.out.printf("%.1fyard = %.1fcm", ydnum, ydnum*91.44);
		
		
	}
}
