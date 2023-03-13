package ch06;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//소수 구하기
		for(int i = 2; i <= 100; i++) {
			//count를 for문 밖에다가 위치하면 19번째 줄에 count = 0이라고 써줘야해서 for문 안에 넣는게 깔끔
			int count = 0;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) count++;
			}
			//소수는 1과 자신만으로 나눠지므로, 자기자신으로 한번만 나눠지면: 소수
			//2부터 나눴으니 count가 1이되면, 소수다.
			if(count == 1) System.out.print(i + " ");
		}
	}
}
