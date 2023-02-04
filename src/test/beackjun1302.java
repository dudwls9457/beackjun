package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class beackjun1302 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		int max = 0;
		for(int i = 0 ; i < N ; i++)
		{
			String sell = sc.next();
			
			if(map.get(sell) == null)
			{
				map.put(sell, 1);
			}else
			{
				map.put(sell, map.get(sell) + 1);
			}
			max = Math.max(max, map.get(sell));
		}
		
		List<String> temp = new ArrayList<>();
		
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			if(pair.getValue() == max)
			{
				temp.add(pair.getKey());
			}	
		}
		Collections.sort(temp);
		System.out.println(temp.get(0));
	}

}
