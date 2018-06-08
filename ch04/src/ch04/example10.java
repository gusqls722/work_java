package ch04;

public class example10 {
	public static void main(String[] args) {
		/*int num = 12345;
		int sum = 0;
		while(num > 0) {
			if(num==12345)
				num = (num%10);
		sum = sum + num;
		num--;
		}
		System.out.println("sum="+sum);*/
		
		int num = 12345;
		int sum = 0;
		
		// num을 10으로 나눈 몫이 0이 될 때까지 반복
		while(num != 0) {
			//	num을 10으로 나눈 나머지는 현재 num의 일의자리 숫자이다.
			//	일의자리 숫자를 sum변수에 저장
			sum += num % 10;
			
			//	현재 num을 10으로 나눈 값을 다시 num변수에 저장
			//	일의자리에 있던 숫자가 지워진다.
			num /= 10;
		}
		System.out.println("sum="+sum);
	}
}
