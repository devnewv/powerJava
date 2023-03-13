package ch06;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("정수 세 개 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		if(a > b) {
			if(b > c) System.out.println(c);
			else System.out.println(b);
		}
		else {
			if(a > c) System.out.println(c);
			else System.out.println(a);
		}
	}
}
