package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class beackjun1339 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		
		int N = sc.nextInt();
		
		String input [] = new String[N];
		for(int i = 0 ; i < N ; i++)
		{
			input[i] = sc.next();
		}
		
		Arrays.sort(input, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			return o2.length() - o1.length();
			}	
		});
		
		int count = 9;
		String result [] = new String [N];
		Arrays.fill(result, "");
		
		for(int i = 0 ; i < N ; i++)
		{
			String temp = input[i];
			for(int j = 0 ; j < temp.length() ; j++)
			{	
				char c = temp.charAt(j);
				if(map.get(c) == null)
				{
					map.put(c, count);
					result[i] += map.get(c);
					count--;
				}else
				{
					result[i] += map.get(c);
				}
			}
		}
		int sum = 0;
		for(int i = 0 ; i < N ; i++)
		{
			sum += Integer.parseInt(result[i]);
		}
		System.out.println(sum);
	}

}
