package type.primitive;

/**
 * 1byte 에 해당하는 범위만큼
 * 정수를 저장하는 타입인
 * byte 타입을 테스트하는 클래스이다.
 * 
 * 1byte = 8bit
 * @author PC38223
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		// 1. 선언
		byte buffer;
		
		// 2. 초기화
		buffer = 0;
		
		// 3. 사용
		for (int idx = 0; idx < 257; idx++) {
			System.out.print(buffer++);
			System.out.println(" , ");
		}
		
		// 저장 할수 있는 값의 범위를 넘어서는 값을
		// 직접할당하는 것은 불가능 
		// 오류코드
//		buffer = 128; // 경계가 127이기 때문에 바로 들어가지 않고 오류 발생
	}

}
