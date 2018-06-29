package ch06;

class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	// 2. 나이
	// 3. 주소
	
	// 행동(메서드)
	// 1. 자기소개
	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
	
	String name;
	int age;
	String address;
	
	// [2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	
	
	Person(String name, int age, String address){
		this.name= name;
		this.age=age;
		this.address=address;
	}
	
	// [2-3] 이름만 입력받는 생성자를 작성하시오.
	// 단, 나이와 주소값은 각각 기본으로 19, "없음" 값으로 초기화하는 생성자를 작성하시오.
	// (힌트 : 2-1에서 작성한 생성자를 이용하여 생성자를 작성하면 됩니다.
	Person(String name) {
		this(name,19,"없음");
	};
	
	void PRINT() {
		System.out.printf("저는 %d살 %s에 사는 %s입니다", age, address, name);
	}
	
	
}
