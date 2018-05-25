package ch02;

public class Ch02Ex01_04 {
	public static void main(String[] args) {
		String item="item";
		String count="count";
		String price="price";
		String pen="pen";
		String note="note";
		String eraser="eraser";
		int num1=20, num2=100, num3=5, num4=95, num5=110, num6=97;
		System.out.printf("%10s%10s%10s%n", item,count,price);
		System.out.printf("%10s%10d%10d%n", pen, num1, num2);
		System.out.printf("%10s%10d%10d%n", note, num3, num4);
		System.out.printf("%10s%10d%10d", eraser, num5, num6);
	}
}
