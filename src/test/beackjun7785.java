package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class beackjun7785 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			String name = sc.next();
			String check = sc.next();
			
			if(check.equals("enter"))
			{
				map.put(name, 1);
			}else
			{
				map.put(name, 0);
			}
		}
	
		StringBuilder stb = new StringBuilder();
		String [] result = new String[map.size()];
		int i = 0 ;
		for(Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				result[i] = entry.getKey();
				i++;
			}
		}
		result = Arrays.stream(result)
					.distinct().filter(s -> (s!=null))
					.toArray(String[]::new);
		
		Arrays.sort(result, Collections.reverseOrder());
		
		for(int j = 0 ; j < result.length ; j++)
		{
			stb.append(result[j] + "\n");
		}
		System.out.println(stb);
	}

}
