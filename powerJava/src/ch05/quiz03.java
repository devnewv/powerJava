package ch05;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		//cm로 표현된 키를 피트와 인치로 변환
		//1피트는 12인치, 1인치는 2.54cm
		
		int height;
		int feet;		//1feet = 12inch
		double inch;	//1inch = 2.54cm
		
		Scanner sc = new Scanner(System.in);
		
		height = sc.nextInt();
		inch = height / 2.54;
		feet = (int)inch / 12;
		inch %= 12;
		
		System.out.printf("%dcm는 %d피트 %f인치입니다.\n", height, feet, inch);
	}
}
