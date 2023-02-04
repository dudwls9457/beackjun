package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class beackjun24444 {

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static boolean [] visited;
	static int [] result;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt(); // 시작 지점
		
		visited = new boolean[N + 1];
		result = new int[N + 1];
		for(int i = 0 ; i <= N ; i++)
		{
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			graph.get(num1).add(num2);
			graph.get(num2).add(num1);
		}
		
		 for(int i = 0 ; i <= N; i++)
		 {
			 Collections.sort(graph.get(i));
		 }
		 
		bfs(R);
		for(int i = 1 ; i <= N ; i++)
		{
			System.out.println(result[i]);
		}
	}
	public static void bfs(int R)
	{
		Deque<Integer> que = new ArrayDeque<>();
		que.add(R);
		visited[R] = true;
		int count = 1;
		result[R] = count++;
		while(que.size() != 0)
		{
			int now = que.poll();
			for(int node : graph.get(now))
			{
				if(visited[node] == false)
				{
					visited[node] = true;
					que.add(node);
					result[node] = count++;
				}
			}
		}
	}
}
