package ch06;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double height, standard_weight, weight;
		
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = sc.nextDouble();
		
		standard_weight = (height - 100) * 0.9;
		
		if(weight > standard_weight)System.out.println("과체중");
		else if(weight < standard_weight) System.out.println("저체중");
		else System.out.println("표준");
	}
}
