package ch06;

import java.util.Scanner;

public class quiz01_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, tmp;
		
		System.out.print("정수를 입력하시오: ");
		a = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = sc.nextInt();
		
		if(a > b) {	//b가 a보다 클때
			tmp = a;
			a = b;
			b = tmp;
		}
		if(a > c) {	//c가 a보다 클때
			tmp = a;
			a = c;
			c = tmp;
		}
		if(b > c) {	//c가 b보다 클때
			tmp = b;
			b = c;
			c = tmp;
		}
		
		System.out.println("정렬된 숫자: " + a + " " + b + " " + c);
	}
}
