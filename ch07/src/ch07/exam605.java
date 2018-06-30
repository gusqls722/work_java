package ch07;

public class exam605 {
	public static void main(String[] args) {
		Student5 s = new Student5("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student5{
	String name;
	int a,b,c,d,e;
	Student5(String name, int a, int b, int c, int d, int e){
		this.name=name;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
	}
	String info(){
		int num = c+d+e;
		float aver = (float)((int)(num/3.0 * 10 +0.5) * 0.1);
		return name+","+a+","+b+","+c+","+d+","+e+","+num+","+aver;
	}
}
