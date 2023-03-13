package ch06;

import java.util.Scanner;

public class loopExample2 {
	public static void main(String[] args) {
		//while문을 이용한 구구단 
		
		int n, i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~9 사이의 숫자를 입력하세요 : ");
		n = sc.nextInt();
		
		while(i <= 9) {
			System.out.println(n + " * " + i + " = " + n*i);
			i++;
		}
	}
}
