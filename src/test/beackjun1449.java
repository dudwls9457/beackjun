package test;

import java.util.Arrays;
import java.util.Scanner;

public class beackjun1449 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		int [] location = new int[N];
		
		for(int i = 0 ; i < N ; i++)
		{
			location[i] = sc.nextInt();
		}
		Arrays.sort(location);
		
		if(L == 1) System.out.println(location.length);
		else
		{
			int now = location[0];
			int ans = 1;
			for(int i = 1 ; i < N ; i++)
			{
				if(location[i] >= now + L)
				{
					now = location[i];
					ans++;
				}else
				{
					continue;
				}
			}
			System.out.println(ans);
		}
	}
}
