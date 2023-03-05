package ch05;

import java.util.Scanner;

public class quiz10 {
	public static void main(String[] args) {
		//ac : ae = bc : de;
		//ac, ae, bc를 입력해서 de를 구하는 프로그램
		
		double ac, ae, bc, de;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ac의 길이는 : ");
		ac = sc.nextDouble();

		System.out.print("ae의 길이는 : ");
		ae = sc.nextDouble();

		System.out.print("bc의 길이는 : ");
		bc = sc.nextDouble();
		
		de = ae * bc / ac;
		
		System.out.println("de의 길이는 : " + de);
	
	}
}
