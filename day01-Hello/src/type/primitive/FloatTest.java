package type.primitive;

/**
 * 실수형 타입인 float, double 타입을
 * 테스트하는 클래스이다.
 * @author PC38223
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14F;
		pi2 = 3.14;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		
		pi1 = 3.14159265358979323846F; // 저장할수 없는 소수점 이하는 잘라내고 반올림
		pi2 = 3.14159265358979323846;  // 표현할 수 있는 크기값에 한계가 있음
		
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		
	}

}
