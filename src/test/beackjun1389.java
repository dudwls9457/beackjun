package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class beackjun1389 {
	
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static boolean [] visited;
	static Integer [][] check;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		visited = new boolean[N+1];
		check = new Integer[N+1][2];
		
		for(int i = 0 ; i < N ; i++)
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
		for(int i = 1 ; i < N ; i++)
		{
			if(visited[i] == false)
			{
				dfs(i);
			}
		}

	}
	public static void dfs(int N)
	{
		Deque<Integer> que = new ArrayDeque<>();
		que.add(N);
		visited[N] = true;
		int count = 1;
		while(que.size() != 0)
		{
			int temp = que.pollFirst();
			for(int node : graph.get(temp))
			{
				if(visited[node] == false)
				{
					visited[node] = true;
					que.add(node);
					check[N][0] = node;
					count++;
				}
			}
//			for(int i = 1 ; i < check.length ; i++)
//			{
//				if(check[i][0] != null)
//				{
//					check[i][1] = count;
//				}
//			}
		}
		
	}
}
