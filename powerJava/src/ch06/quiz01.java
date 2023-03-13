package ch06;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("정수를 입력하시오: ");
		a = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = sc.nextInt();
		
		String str = "정렬된 숫자: ";
	
		if(a < b && a < c) {
			if(b < c) System.out.println(str + a + " " + b + " " + c);
			else System.out.println(str + a + " " + c + " " + b);
		}
		if(b < a && b < c) {
			if(a < c) System.out.println(str + b + " " + a + " " + c);
			else System.out.println(str + b + " " + c + " " + a);
		}
		if(c < a && c < b) {
			if(a < b) System.out.println(str + c + " " + a + " " + b);
			else System.out.println(str + c + " " + b + " " + a);
		}
	}
}
