package test02;

public class Person implements Action {
	private String name;
	private int age;
	
	public static void pr(Object o) {
		System.out.println(o);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		pr(this.name+"님이 잡니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pr(this.name+"님이 뜁니다.");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		pr(this.age + "살 " +this.name+"님이 걷습니다.");
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		pr(this.name+"님이 일어납니다.");
	}


}
