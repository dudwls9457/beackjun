package test;

import java.util.Scanner;

public class beackjun1085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int min = 10000;
		
		int x = sc.nextInt(); // 지금 개나리가 있는 곳
		int y = sc.nextInt();
		
		int w = sc.nextInt(); // 끝 벽
		int h = sc.nextInt();
		
		if(x - 0 < min) min = x - 0;
		if(y - 0 < min) min = y - 0;
		if(w - x < min) min = w - x;
		if(h - y < min) min = h - y;
		
		System.out.println(min);
	}

}
