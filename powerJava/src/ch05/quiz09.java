package ch05;

import java.util.Scanner;

public class quiz09 {
	public static void main(String[] args) {
		//크기 : p 
		//넓이 : s
		//압력의 세기 : p/s
		
		double p, s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("힘의 크기 : ");
		p = sc.nextDouble();
		
		System.out.print("넓이 : ");
		s = sc.nextDouble();
		
		System.out.println("압력의 크기 : " + p/s);
	}
}
