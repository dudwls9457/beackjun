package test;

import java.util.HashMap;
import java.util.Scanner;

public class beackjun1235 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String [] input = new String[N];
		HashMap<String, String> map = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			input[i] = sc.next();
		}
		
		int count = input[0].length() - 1;
		int ans = 0;
		
		while(true)
		{
			boolean flag = false;
			for(int i = 0 ; i < N ; i++)
			{
				if(map.get(input[i].substring(count)) != null)
				{
					flag = true;
					break;
				}
				else map.put(input[i].substring(count), "value");
			}
			count--;
			ans++;
			if(flag == false) break;
		}
		System.out.println(ans);
	}
}
