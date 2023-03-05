package ch05;

import java.util.Scanner;

public class metropolis {

	public static void main(String[] args) {
		//조건
		//2가지 조건 중 하나를 만족해야 거대도시가 된다.
		//1. 한 나라의 수도이고 인구가 100만 이상
		//2. 연소득이 1억 이상인 부자가 50만 이상
		
		//실행결과
		//수도입니까?(수도: 1 / 수도아님: 0) : 1
		//인구(단위: 만) : 200
		//부자의 수(단위: 만) : 100
		//메트로폴리스 여부: true
		
		Scanner sc = new Scanner(System.in);
		
		boolean isCapital;
		int population;
		int rich;
		
		System.out.print("수도입니까?(수도: 1 / 수도아님: 0) : ");
		isCapital = (sc.nextInt() == 1) ? true : false;
		
		System.out.print("인구(단위: 만) : ");
		population = sc.nextInt();
		
		System.out.print("부자의 수(단위: 만) : ");
		rich = sc.nextInt();
		
		boolean isMetro = (isCapital && population >= 100) || (rich >= 50);
		
		System.out.print("메트로폴리스 여부 : " + isMetro);
		
	}
}
