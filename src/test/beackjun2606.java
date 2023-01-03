package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class beackjun2606 {

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i = 0 ; i < N + 1 ; i++)
		{
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			graph.get(n1).add(n2);
			graph.get(n2).add(n1);
			
		}
		System.out.println(bfs(N));
	}
	
	public static int bfs(int N)
	{	
		int count = 0;
		boolean [] visited = new boolean[N + 1];
		Arrays.fill(visited, false);
		visited[1] = true;
		int cur;
		
		Deque<Integer> que = new ArrayDeque<>();
		que.add(1);
		while(que.size() != 0)
		{	
			cur = que.pollFirst();
			for(int node : graph.get(cur))
			{
				if(visited[node])
				{
					continue;
				}else
				{	
					visited[node] = true;
					que.add(node);
					count++;
				}
			}
		}
		return count;
	}

}
