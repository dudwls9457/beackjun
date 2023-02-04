package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class beackjun16953 {
	
	static HashMap<Long, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		
		System.out.println(bfs(A,B));
		
	}
	
	public static int bfs(Long A, Long B)
	{
		Deque<Long> que = new ArrayDeque<>();
		
		que.add(A);
		map.put(A, 1);
		
		while(que.size() != 0)
		{
			Long now = que.pollFirst();
			for(int i = 0 ; i < 2 ; i++)
			{	
				Long next;
				if(i == 0) next = now * 2;
				else next = now * 10 + 1;
				
				if(next.equals(B)) return map.get(now) + 1;
				
				if(now > B * 10 + 1) continue;
				
				if(next > 0 && next <= 1000000000)
				{
					if(map.get(next) == null)
					{	
						map.put(next, map.get(now) + 1);
						que.add(next);
					}
				}
			}
		}
		return -1;
	}

}
