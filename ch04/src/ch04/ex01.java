package ch04;

public class ex01 {
	public static void main(String[] args) {
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((2*x)+(4*y)==10) {
				System.out.printf("[%d %d]", x, y);
				}
			}
		}
	}
	
}
