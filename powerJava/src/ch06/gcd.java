package ch06;

import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		//실행결과 
		//두개의 정수입력 : 24 36
		//최대공약수 : 12
		
		int a, b, tmp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
	
		while(b != 0) {
			tmp = a % b;
			a = b;
			b = tmp;
		}
		
		System.out.println("최대 공약수 : " + a);
	}
}
