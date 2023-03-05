package ch05;

public class quiz08 {
	public static void main(String[] args) {
		//지구에서 태양까지의 거리 : 1억5000만km
		//초속 30만km의 빛이 출발해서 도착하는데 걸리는 시간
		//모든 상수를 지수 표기법으로 표현하라
		
		double distance = 1.5e8;
		double light = 3.0e5;
		System.out.println("빛이 지구에 도달하는데 걸리는 시간은 " + distance/light + "초.");
	}
}
