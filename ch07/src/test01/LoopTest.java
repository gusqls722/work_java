package test01;

public class LoopTest {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("i="+i+" :짝수");
			}else {
				System.out.println("i="+i+" :홀수");
			}
		}
	}
}
