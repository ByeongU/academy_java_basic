package control.loop;

/**
 * 1 ~ 100 사이의 짝수의 합을 계산하는 클래스
 * while 를 활용
 * @author PC38223
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		int number = 0;
		int sum = 0;
		
		while (number <= 100) {
			sum += number;
			number += 2; 
		}
		System.out.printf("1 ~ 100 사이의 짝수의 합 : %d%n", sum);
	}

}
