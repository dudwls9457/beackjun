package test;

import java.util.HashSet;
import java.util.Scanner;

public class beackjun11478 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0 ; i < S.length() ; i++)
		{
			String name = "";
			for(int j = i ; j < S.length() ; j++)
			{
				name += S.substring(j ,j + 1);
				set.add(name);
			}
		}
		System.out.println(set.size());
	}

}
