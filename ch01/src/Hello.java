
public class Hello {

	public static void main(String[] args) {
	
		int a,b,j;
		
		for(a=0;a<5;a++) {
			for(j=0;j<a;j++) {
				System.out.print("★ ");
			}
			for(b=5-a;b>0;b--) {
				
				System.out.printf("☆ ");
					
			}
			System.out.println("");
		}
	}

}
