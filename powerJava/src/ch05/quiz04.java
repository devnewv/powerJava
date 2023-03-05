package ch05;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		//원기둥 부피(밑넓이 * 높이)를 구하는 프로그램
		//반지름, 높이
		
		int r, height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥의 반지름을 입력하세요 : ");
		r = sc.nextInt();
		
		System.out.print("원기둥의 높이를 입력하세요 : ");
		height = sc.nextInt();
		
		double volume = Math.PI * r * r * height;
		System.out.printf("원기둥의 부피는 %.2f입니다.\n", volume);
	}
}
