package ch05;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		//저금통에 들어있는 돈의 액수를 구하는 프로그램
		//500, 100, 50, 10원짜리 동전의 개수를 입력
		
		Scanner sc = new Scanner(System.in);
		
		int coin500, coin100, coin50, coin10, sum = 0;
		
		System.out.print("500원 개수 : ");
		coin500 = sc.nextInt();
		
		System.out.print("100원 개수 : ");
		coin100 = sc.nextInt();
		
		System.out.print("50원 개수 : ");
		coin50 = sc.nextInt();
		
		System.out.print("10원 개수 : ");
		coin10 = sc.nextInt();
		
		sum = coin500 * 500 + coin100 * 100 + coin50 * 50 + coin10 * 10;
		System.out.println("총액 : " + sum);
	}
}
