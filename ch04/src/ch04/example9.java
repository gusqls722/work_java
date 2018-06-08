package ch04;

public class example9 {
	public static void main(String[] args) {
		/*String str = "12345";
		int sum = 0;
		for(int i = 0;i<str.length();i++) {
			sum = sum + (int)str.charAt(i)-48;
		}
		System.out.println("sum="+sum);*/
		String str = "12345";
		int sum = 0;
		for(int i = 0;i<str.length();i++) {
			int num = (int)str.charAt(i)-'0';
			sum += num;
		}
		System.out.println("sum="+sum);
	}
}
