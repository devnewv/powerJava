package ch05;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		//상자의 체적을 구하는 프로그램
		//체적 : 길이 * 너비 * 높이
		//크기는 100 * 100 * 100을 넘지않고, 최소로 구해보자
		
		byte length, width, height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길이는 : ");
		length = sc.nextByte();
		
		System.out.print("너비는 : ");
		width = sc.nextByte();
		
		System.out.print("높이는 : ");
		height = sc.nextByte();
		
		System.out.println("체적은 " + length * width * height);
	
	}
}
