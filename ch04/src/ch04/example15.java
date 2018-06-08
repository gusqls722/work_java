package ch04;

public class example15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		while(tmp!=0) {
			String result1 = "";
			for(int i = 0 ; tmp>0 ;i++) {
				int num = (int)Math.pow(10,i);
				tmp = (number / num)%10;
				if(tmp==0) {
					break;
				}
				result1 = result1 + Integer.toString(tmp);
			}
			result = Integer.parseInt(result1);
		}
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}
