package ch05;

import java.util.Scanner;

public class q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] alp = new int[26];
		char[] Arr = new char[26];
 		int count=0;
		for(int i=0;true;i++) {
			String input = scanner.nextLine();
			char[] ch = {input.charAt(0)};
			
			if(!(ch[0] >='A' && ch[0]<='Z')) {
				break;
			}
			Arr[ch[0]-'A']=ch[0];
			alp[ch[0]-'A']++;
		}
		
		for(int i=0;i<alp.length;i++){
			if(alp[i]==0) {
				continue;
			}
			System.out.printf("%s : %s\n", Arr[i],alp[i]);
		}
	}
}
