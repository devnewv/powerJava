package ch05;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		//평을 평방미터로 환산하는 프로그램 작성
		//1평은 3.3058
		
		double sqft = 3.3058; 
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평수를 입력하세요 : ");
		number = sc.nextInt();

		System.out.print(number + "평은 " + sqft * number + "평방미터이다.");
		
	}
}
