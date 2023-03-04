package ch04;

import java.util.Scanner;

public class box {
	public static void main(String[] args) {
		//직사각형의 둘레와 면적을 구하는 프로그램 구하기
		//가로, 세로, 넓이, 둘레 : w, h, w*h, 2(w+h)
		//실행결과 예시
		//사각형의 넓이: 50.0
		//사각형의 둘레: 30.0
		
		Scanner sc = new Scanner(System.in);
		
		double w, h;
		double area;
		double round;
		
		System.out.print("가로: ");
		w = sc.nextDouble();
		
		System.out.print("세로: ");
		h = sc.nextDouble();
		
		area = w * h;
		round = 2 * (w + h);
		
		System.out.println("사각형의 넓이: " + area);
		System.out.println("사각형의 둘레: " + round);
	}
}
