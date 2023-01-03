package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class beackjun1260 {
	
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정점
		int M = sc.nextInt(); // 간선
		int V = sc.nextInt(); // 시작 번효
		
		
		
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
		dfs(V , N);
		System.out.println();
		bfs(V , N);
		
	}
	
	public static void bfs(int V , int N)
	{
		boolean [] visited = new boolean [N+1];
		Arrays.fill(visited, false);
		visited[V] = true;
		int cur;
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(V);
		while(deque.size() != 0)
		{
			cur = deque.pollFirst();
			Collections.sort(graph.get(cur));
		
			for(int node : graph.get(cur))
			{	
				if(visited[node] == false)
				{
					deque.add(node);
					visited[node] = true;
				}
				
			}
			System.out.print(cur + " ");
		}
	}
	
	public static void dfs(int V , int N)
	{
		boolean [] visited = new boolean [N+1];
		Arrays.fill(visited, false);
		int cur;
		
		Stack<Integer> stack = new Stack<>();
		stack.add(V);
		while(stack.size() != 0)
		{
			cur = stack.pop();
			graph.get(cur).sort(Collections.reverseOrder());
			if(visited[cur] == false)
			{
				visited[cur] = true;
				for(int node : graph.get(cur))
				{
					stack.add(node);
				}
				System.out.print(cur + " ");
			}
		}
		
	}

}
