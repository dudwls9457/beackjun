package test;

import java.util.Scanner;

public class beackjun2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0 ;
		String input = sc.next();
		
		int before = input.length();
		int result = input.length();
		
		count = input.replaceAll("c=", "").length();
		result -= (before - count )/2;
		count = input.replaceAll("c-", "").length();
		result -= (before - count )/2;
		count = input.replaceAll("dz=", "").length();
		result -= (before - count )/3;
		count = input.replaceAll("d-", "").length();
		result -= (before - count )/2;
		count = input.replaceAll("lj", "").length();
		result -= (before - count )/2;
		count = input.replaceAll("nj", "").length();
		result -= (before - count )/2;
		count = input.replaceAll("s=", "").length();
		result -= (before - count )/2;
		count = input.replaceAll("z=", "").length();
		result -= (before - count )/2;
		
		System.out.println(result);
	
	}

}
