package test;

import java.awt.Checkbox;
import java.util.Scanner;

public class beackjun1316 {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			String s = sc.next();
			if(check(s))
			{
				count++;
			}
		}
		System.out.println(count);
	
	}
	
	public static boolean check(String s)
	{
		boolean [] check =  new boolean[26];
		int prev = 0;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			int temp = s.charAt(i);
			
			if(prev != temp)
			{
				if(check[temp - 'a'] == false)
				{
					check[temp - 'a'] = true;
					prev = temp;
				}else
				{
					return false;
				}
			}
			else
			{
				continue;
			}
		}
		return true;
	}
}
