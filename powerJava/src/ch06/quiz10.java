package ch06;

import java.util.Scanner;

public class quiz10 {
	public static void main(String[] args) {
		//피보나치 수열
		long a = 0, b = 1, c;
		int i, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇항까지 출력할거임?: ");
		n = sc.nextInt();
		
		System.out.print(a + " " + b + " ");
		
		for(i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
