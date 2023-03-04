package ch04;

import java.util.Scanner;

public class add2 {
	public static void main(String[] args) {
		//실행결과
		//첫번째 숫자를 입력하세요 : 
		//두번째 숫자를 입력하세요 : 
		//합
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		a = sc.nextInt();

		System.out.print("두번째 숫자를 입력하세요 : ");
		b = sc.nextInt();
		
		System.out.println(a + b);
	}
}
