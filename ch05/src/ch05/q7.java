package ch05;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int max=0;
		int min=9999;
		for(int i=0;i<num.length;i++) {
			String input = scanner.nextLine();
			if(Integer.parseInt(input)>=10000 || Integer.parseInt(input)<=0) {
				input = "100";
			}
			num[i]=Integer.parseInt(input);
			if(num[i]<100) {
				if(max<num[i]) {
					max=num[i];
				}
			}else if(num[i]>=100){
				if(min>num[i]) {
					min=num[i];
				}
			}
		}
		System.out.printf("%d %d",max,min);
	}
}
