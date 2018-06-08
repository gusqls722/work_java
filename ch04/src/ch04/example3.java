package ch04;

public class example3 {
	public static void main(String[] args) {
		int count = 0; // 몇 번 반복했는지 체크하기 위한 변수
		
		/* [방법 1]
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum += j;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);*/
		
		// [방법 2]
		int sum = 0;		//괄호 안의 부분 합
		int totalSum = 0;	// 총합
		
		for(int i=1; i<=10; i++) {
			sum+=i;
			totalSum += sum;
			count++;
		}
		System.out.println(totalSum);
		System.out.println(count);
	}
}
