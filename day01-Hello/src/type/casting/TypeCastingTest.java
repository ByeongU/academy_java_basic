package type.casting;

/**
 * 숫자형 데이터 사이에 
 * 형 변환(type casting)을
 * 테스트하는 클래스 이다
 * @author PC38223
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.14159265358979323846;
		int number = 100;
		int result;
		
		// (타입)피연산값; <== 피 연산값을 강제 형변환 (디모션 데이터 손실 가능성O)
		result = number +(int)pi;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("double pi = " + pi);
		System.out.println("int number = " + number);
		System.out.println("int result = " + result);
		
	}

}
