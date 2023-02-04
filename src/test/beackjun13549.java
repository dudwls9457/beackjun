package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun13549 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(rec(N,K));
	}
	
	
	public static int rec(int N, int K)
	{
		int [] move = new int [1000001];
		boolean [] visited = new boolean[1000001];
		
		Deque<Integer> que = new ArrayDeque<>();
		que.add(N);
		visited[N] = true;
		
		while(que.size() != 0)
		{
			int now = que.poll();
			
			for(int i = 0 ; i < 3 ; i++)
			{
				int next;
				if(i == 0) next = now * 2;
				else if(i == 1) next = now + 1;
				else next = now - 1;
				
				if(next == K)
				{
					if(next != now * 2)
						return move[now] + 1;
					else
						return move[now];
				}
				
				if(next >= 0 && next <= 100000)
				{
					if(visited[next] == false)
					{
						visited[next] = true;
						que.add(next);
						if(next != now * 2)
							move[next] = move[now] + 1;
						else
							move[next] = move[now];
					}
				}
			}
		}
		return 0;
	}
}
