package test02;

public class Cat implements Action{
	
	private String name;
	private int age;
	
	public static void pr(Object o) {
		System.out.println(o);
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		pr("고양이 "+this.name+"가 잡니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pr("고양이 "+this.name+"가 뜁니다.");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		pr(this.age + "살 고양이 " +this.name+"가 걷습니다.");
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		pr("고양이 " +this.name+"가 일어납니다.");
	}

}
