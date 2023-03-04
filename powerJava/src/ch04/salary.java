package ch04;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		//10년동안 월급을 모두 저금할 경우, 모을 수 있는 돈
		//실행결과
		//월급을 입력하세요 : 200
		//10년 동안의 저축액 : 24000
		
		Scanner sc = new Scanner(System.in);
		
		int salary, deposit;
		
		System.out.print("월급을 입력하세요 :");
		salary = sc.nextInt();
		
		deposit = salary * 120;
		System.out.print("10년 동안의 저축액 :" + deposit);
	}
}
