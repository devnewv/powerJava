package ch06;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String spell;
		
		System.out.print("아무거나 입력하세요: ");
		spell = sc.next().toUpperCase();
		
		switch(spell.charAt(0)) {
		case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
		}
	}
}
