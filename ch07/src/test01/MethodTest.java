package test01;

public class MethodTest {
	String str = "abc";
	
	String test(){
		return "abc";
	}
	String test(int a) {
		return "abc";
	}
	String test(double b) {
		return "abc";
	}
	// 데이터 타입은 String
	// 함수명은 test()
	// 3개의 동일한 함수명으로 선언과
	// 호출해주시면 됩니다.
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1.str==mt2.str);
		String a = mt1.test();
		String b = mt1.test(3);
		String c = mt1.test(3.5);
	}
}
