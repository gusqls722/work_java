package ch04;

public class example12 {
	public static void main(String[] args) {
		/*int[] num= {1, 2, 3};
		int[] res= {2, 3, 4, 5, 6, 7, 8, 9};
		
		int y=0,x=0,sum=0;
		for(y=0;y<=2;y++) {
			for(x=0;x<=2;x++) {
				System.out.printf("%d*%d=%d \t", res[x],num[y],res[x]*num[y]);
				}
			System.out.println();
			}
		System.out.println();
		for(y=0;y<=2;y++) {
			for(x=3;x<=5;x++) {
				System.out.printf("%d*%d=%d \t", res[x],num[y],res[x]*num[y]);
				}
			System.out.println();
			}
		System.out.println();
		for(y=0;y<=2;y++) {
			for(x=6;x<=7;x++) {
				System.out.printf("%d*%d=%d \t", res[x],num[y],res[x]*num[y]);
				}
			System.out.println();
			}*/
		
		/*// [ 방법 2 ]
			for (int i=1;i<=9;i++) {
				for(int j=1; j<=3; j++) {
					int x = (j+1) + ((i-1)/ 3)*3;
					int y = i%3==0 ? 3: i % 3;
					
					if(x<10) {
					System.out.printf("%d*%d=%d \t", x, y, y*x);
					}
				}
				if(i%3==0) {
					System.out.println();
				}
				System.out.println();
			}*/
		
		for(int i=1; i<=3;i++) {
			for(int j=2; j<=4; j++) {
				System.out.printf("%d*%d=%d\t",j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=3;i++) {
			for(int j=5; j<=7; j++) {
				System.out.printf("%d*%d=%d\t",j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=3;i++) {
			for(int j=8; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
			
		}
}