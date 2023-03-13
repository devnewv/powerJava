package ch06;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x의 값을 입력하세요: ");
		double x = sc.nextDouble();
		
		if(x <= 0) System.out.println(x * x * x - 9 * x + 2);
		else System.out.println(7 * x + 2);
	}
}
