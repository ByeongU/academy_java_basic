package control.switchstmt;

import java.util.Scanner;

/**
 * switch 구문을 사용하여 다음 기준으로
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
public class ReportGrade {

	public static void main(String[] args) {
		int score;
		char grade;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 점수를 입력 : ");
		score = scan.nextInt();
		
		switch (score / 10 ) {
		case 10 : case 9 : 
			grade = 'A';
			break;
		case 8 : 
			grade = 'B';
			break;
		case 7 : case 6 :
			grade = 'C';
			break;
		case 5 : case 4 :
			grade = 'D';
			break;
			
		default : 
			grade = 'F';
		}
		
		System.out.printf("%d 점에 해당하는 학점은 %c 입니다.", score, grade);

	}

}
