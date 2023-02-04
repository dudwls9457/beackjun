package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class beackjun13913 {
	
	static int [] before = new int [100001];
	static int [] time = new int [100001];
	static boolean [] visited = new boolean[100001];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if(N == K)
		{
			System.out.println(0 +"\n" + N);
		}else
		{
			System.out.println(bfs(N,K));
			
			StringBuilder stb = new StringBuilder();
			Stack<Integer> stack = new Stack<>();
			
			int index = before[K];

			while(true)
			{
				stack.add(index);
				if(index == N) break;
				index = before[index];
			}
			
			while(stack.size() != 0)
			{
				stb.append(stack.pop() + " ");
			}
			stb.append(K);
			System.out.println(stb);
		}
	}
	public static int bfs(int N , int K)
	{
		Deque<Integer> que = new ArrayDeque<>();
		visited[N] = true;
		que.add(N);

		while(que.size() != 0)
		{
			int now = que.pollFirst();
			
			for(int i = 0 ; i < 3 ; i++)
			{
				int next = 0;
				if(i == 0) next = now - 1;
				else if(i == 1) next = now + 1;
				else next = now * 2;
				
				if(next == K)
				{
					before[next] = now;
					return time[now] + 1;
				}
				
				if (next < 0 || next > 100000) continue;
				
				if(visited[next] == false)
				{
					visited[next] = true;
					que.add(next);
					time[next] = time[now] + 1;
					before[next] = now;
				}
			}
		}
		return -1;
	}
}
