package test01;
// 선생님 깃주소 Runtym/java2
public class ArrayTest {
	public static void main(String[] args) {
		int[] a = new int[5];
		for( int i=0; i<5; i++) {
			double d = Math.random()*10;
			a[i] = (int)d;
			for(int j=i-1; j>=0;j--) {
				if(a[i]==a[j]) {
					j=0;
					i--;
				}
			}
		}
		for(int i=0; i<5 ; i++) {
			System.out.println(a[i]);
		}
	}
}