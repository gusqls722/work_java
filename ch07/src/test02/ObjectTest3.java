package test02;

public class ObjectTest3 {

	private int age;
	private String name; 
	
	public String toString() {
		return "이름 : " + this.name + ", 나이 : " + this.age;
	}
	
	public ObjectTest3(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		ObjectTest3 ot1 = new ObjectTest3(22, "홍길동");
		System.out.println(ot1);
		ObjectTest3 ot2 = new ObjectTest3(32, "이길동");
		System.out.println(ot2);
		ObjectTest3 ot3 = new ObjectTest3(42, "오길동");
		System.out.println(ot3);
		
		
	}
}
