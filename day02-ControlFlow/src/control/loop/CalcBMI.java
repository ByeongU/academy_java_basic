package control.loop;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		double height = 0;
		double tall = 0 ;
		double BMI = 0;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.print("몸무게(kg)와 키(M)를 입력하세요.");
		height = scan.nextDouble();
		tall = scan.nextDouble();
		
		BMI = height / tall * tall ;
		if (BMI > 40) {
			System.out.printf("병적인 비만");
		} else if (BMI > 27.5 ) {
			System.out.printf("비만");
		} else if (BMI >= 23 ) {
			System.out.printf("과체중");
		} else if (BMI >= 18.5 ) {
			System.out.printf("정상");
		} else if (BMI >= 15 ) {
			System.out.printf("저체중");
		} else 
			System.out.printf("병적인 저체중");
	}

}
