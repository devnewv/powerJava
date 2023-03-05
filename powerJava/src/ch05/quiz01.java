package ch05;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		//이름과 나이를 물어보고 출력
		
		String name;
		int age;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = sc.next();

		System.out.print("나이: ");
		age = sc.nextInt();

		System.out.println("이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
}
