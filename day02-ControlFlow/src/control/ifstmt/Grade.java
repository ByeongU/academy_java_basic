package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음 기준으로
 * 
 * 90점 이상 A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지 F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 
 * 점수 int 타입 변수명 score
 * 학점 char 타입 변수명 grade 을 사용할 것
 * 
 * 출력시 printf 사용
 * @author PC38223
 *
 */
public class Grade {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.print("0 ~ 100 사이의 점수를 입력 : ");
		score = scan.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';			
		} else if (score >= 60 && score < 80) {
			grade = 'C';
		} else if (score >= 40 && score < 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("%d 점에 해당하는 학점은 %c", score, grade);
		
	}

}
