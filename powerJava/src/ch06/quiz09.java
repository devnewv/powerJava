package ch06;

import java.util.Scanner;

public class quiz09 {
	public static void main(String[] args) {
		String str;
		double a, b;

		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요: ");
		str = sc.nextLine();
		System.out.print("숫자를 입력하세요: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if(str.charAt(0) == '+') System.out.println(a + b);
		else if(str.charAt(0) == '-') System.out.println(a - b);
		else if(str.charAt(0) == '*') System.out.println(a * b);
		else {
			if(b != 0) System.out.println(a / b);
			else System.out.println("error!");
		}
	}
}
