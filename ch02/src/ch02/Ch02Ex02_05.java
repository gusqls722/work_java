package ch02;
import java.util.Scanner;
public class Ch02Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input= scanner.nextLine();
		int weight= Integer.parseInt(input);
		
		String input2= scanner.nextLine();
		float num= Float.parseFloat(input2);
		
		System.out.printf("%d * %f = %f", weight, num,(float)weight*num);
	}
}
