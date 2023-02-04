package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class beackjun11725 {

	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int N;
	static int mother [];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		N = sc.nextInt();
		
		mother = new int[N + 1];
		
		for(int i = 0 ; i <= N ; i++)
		{
			list.add(new ArrayList<>());
		} // 초기화
		
		for(int i = 0 ; i < N - 1 ; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			list.get(num1).add(num2);
			list.get(num2).add(num1);
		}
		
		dfs();
		for(int i = 2 ; i <= N ; i++)
		{
			stb.append(mother[i] + "\n");
		}
		System.out.println(stb);
	
	}
	
	public static void dfs()
	{
		boolean [] visited = new boolean[N + 1];
		Deque<Integer> que = new ArrayDeque<>();
		que.add(1);
		visited[1] = true;
		
		while(que.size() != 0)
		{
			int now = que.poll();
			
			for(int node : list.get(now))
			{
				if(visited[node] == false)
				{
					visited[node] = true;
					que.add(node);
					mother[node] = now; 
				}
			}
		}
		
	}
}
