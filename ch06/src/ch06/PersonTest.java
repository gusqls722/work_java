package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명 (객체 3개) 만들기
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		
		Person[] arr = new Person[3];
		for(int i=0; i<arr.length;i++) {
			arr[i] = new Person();
		}
		
		arr[0].name="서현빈";
		arr[0].age=19;
		arr[0].address="부천시";
		
		arr[1].name="사람1";
		arr[1].age=20;
		arr[1].address="인천광역시";
		
		arr[2].name="사람2";
		arr[2].age=21;
		arr[2].address="서울특별시";
		for(int i=0;i<arr.length;i++) {
			arr[i].PRINT();
			System.out.println();
		}
	}
}
