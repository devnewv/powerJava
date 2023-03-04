package ch04;

import java.util.Scanner;

public class circleArea {
	public static void main(String[] args) {
		//실행결과
		//반지름을 입력하세요: 5
		//78.5(3.14 * 5 * 5)
		
		Scanner sc = new Scanner(System.in);
		
		int r;
		double area;
		
		System.out.print("반지름을 입력하세요: ");
		r = sc.nextInt();
		
		area = 3.14 * r * r;
		System.out.println(area);
	}
}
