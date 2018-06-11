package ch04;

public class example15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		while(tmp!=0) {
			/*String result1 = "";
			for(int i = 0 ; tmp>0 ;i++) {
				int num = (int)Math.pow(10,i);
				tmp = (number / num)%10;
				if(tmp==0) {
					break;
				}
				result1 = result1 + Integer.toString(tmp);
			}
			result = Integer.parseInt(result1);*/
			
			// [ 다른방법 ]
			// result에 10을 곱하여 일의 자리 수를 저장할 공간을 확보한 후
			// tmp에 남아있는 일의 자리수를 끄집어 내어 result에 저장
			// 반복하다 보면 거꾸로 저장이 된다.
			result = result * 10 + tmp %10 ;
			tmp /= 10;
		}
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}
