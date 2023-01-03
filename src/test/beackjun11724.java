package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class beackjun11724 {

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정점
		int M = sc.nextInt(); // 간선
		
		for(int i = 0 ; i <= N ; i++)
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
		bfs(N);
		System.out.println(count);
		
	}
	
	public static void bfs(int N)
	{
		boolean [] visited = new boolean [N + 1];
		Arrays.fill(visited, false);
		
		Deque<Integer> que = new ArrayDeque<>();
		int cur;
		
		for(int i = 1 ; i <= N ; i++)
		{
			
			if(visited[i])
			{
				continue;
			}else
			{
				que.add(i);
				while(que.size() != 0)
				{
					cur = que.pollFirst();
					Collections.sort(graph.get(cur));
				
					for(int node : graph.get(cur))
					{	
						if(visited[node] == false)
						{
							que.add(node);
							visited[node] = true;
						}
						
					}
				}
				count++;
			}
		}

	}
}
