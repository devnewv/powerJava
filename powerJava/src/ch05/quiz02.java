package ch05;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		//두 개의 정수를 입력받아서, 큰 수를 작은 수로 나눈 몫과 나머지를 출력
		
		int a, b, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		a = sc.nextInt();
		
		System.out.print("정수를 입력하세요: ");
		b = sc.nextInt();
		
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a + "을 " + b + "로 나눈 몫은 " + a/b + "이고 나머지는 " + a%b + "이다.");
		
		
	}
}
