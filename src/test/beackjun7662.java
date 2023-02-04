package test;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class beackjun7662 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		TreeMap<Integer, Integer> treemap = new TreeMap<>();
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int k = sc.nextInt();
			
			treemap.clear();
			for(int j = 0 ; j < k ; j++)
			{	
				String input = sc.next();
				switch(input)
				{
					case "I" :
						int temp = sc.nextInt();
						treemap.put(temp, treemap.getOrDefault(temp, 0) + 1);
						break;
					case "D" :
							int change = sc.nextInt();
							int num = 0;
							if(treemap.size() == 0 ) continue;
							if(change == 1)
							{
								num = treemap.lastKey();
							}else
							{
								num = treemap.firstKey();
							}
							if(treemap.put(num, treemap.get(num)-1)==1) {
								treemap.remove(num);
							}
						
						break;
				}
			}
			if(treemap.size() == 0) System.out.println("EMPTY");
			else System.out.println(treemap.lastKey() + " " + treemap.firstKey());
		}
	}

}
