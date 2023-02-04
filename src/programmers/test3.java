package programmers;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String today = sc.nextLine();
		
		int arr [] = new int [26];
		
		arr[(int)today.charAt(0) - 65] = (int)today.charAt(2) - 48;
	
		System.out.println(Integer.valueOf(today.substring(2)));
	
	}

}
