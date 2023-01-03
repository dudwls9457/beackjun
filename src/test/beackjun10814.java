package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class beackjun10814 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String [][] get = new String[N][2];
		
		for(int i = 0 ; i < N ; i++)
		{
			get[i][0] = sc.next();
			get[i][1] = sc.next();
		}
		
		Arrays.sort(get, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		
		
		for(int i = 0 ; i < N ; i++)
		{
			System.out.println(get[i][0] + " " + get[i][1]);
		}
	}

}
