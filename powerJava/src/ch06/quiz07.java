package ch06;

import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int c = 1; c < 100; c++) {
			for(int b = 1; b < 100; b++) {
				for(int a = 1; a < 100; a++) {
					if(c * c == a * a + b * b) {
						System.out.printf("%d^2 = %d^2 + %d^2\n", c, b, a);
						count++;
					}
				}
			}
		}
		System.out.println("count: " + count);
	}
}
