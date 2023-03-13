package ch06;

import java.util.Scanner;

public class quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year, month, day, today;
		
		System.out.print("연도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요: ");
		day = sc.nextInt();
	
		today = 0;
		today += (year - 1900) * 365;
		today += (year - 1900) / 4;
		if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && (month == 1 || month == 2)) today += day - 1;
		else today += day;
		
		String str = "";
		
		if(today % 7 == 1) str = "일요일";
		if(today % 7 == 2) str = "월요일";
		if(today % 7 == 3) str = "화요일";
		if(today % 7 == 4) str = "수요일";
		if(today % 7 == 5) str = "목요일";
		if(today % 7 == 6) str = "금요일";
		if(today % 7 == 0) str = "토요일";
		
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + str + "입니다.");
	
	}
}
