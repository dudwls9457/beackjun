package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class beackjun1697 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if(N == K) System.out.println(0);
		else System.out.println(bfs(N,K));
	
	}
	
	public static int bfs(int N , int K)
	{
		boolean [] position  = new boolean [100001];
		int [] count = new int [100001];
		
		Arrays.fill(position, false);
		Arrays.fill(count, 0);
		
		Deque<Integer> que = new ArrayDeque<>();
		
		que.add(N);
		position[N] = true;
		
		while(que.size() != 0)
		{
			int now = que.poll();
			
			for(int i = 0 ; i < 3 ; i++)
			{
				int next;
				
				if(i == 0) next = now - 1;
				else if(i == 1) next = now + 1;
				else next = now * 2;
				
				if(next == K) return count[now] + 1;
				
				if(next >= 0 && next <= 100000)
				{
					if(position[next] == false)
					{
						position[next] = true;
						que.add(next);
						count[next] = count[now] + 1;
					}
				}
			}
		}
		return 0;
	}
}
