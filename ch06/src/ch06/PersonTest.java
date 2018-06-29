package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명 (객체 3개) 만들기
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
	
		Person[] arr = new Person[3];
		/*for(int i=0; i<arr.length;i++) {	
			arr[i] = new Person(i);
		}*/
		// [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오
		
		/*for(int i=0;i<arr.length;i++) {
			arr[i].PRINT();
			System.out.println();
			}*/
		// [2-4] 2-3에서 생성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		Person HeungMin = new Person("흥민");
		// [2-5] 2-4 객체를 이용하여 introduce() 메서드를 호출하세요
		HeungMin.PRINT();
		
	
		}
	}
