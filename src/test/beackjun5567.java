package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class beackjun5567 {
	
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0 ; i <= n ; i++)
		{
			list.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < m ; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			list.get(num1).add(num2);
			list.get(num2).add(num1);
		}
		System.out.println(bfs() - 1);
	}
	public static int bfs()
	{
		Deque<Integer> que = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		
		for(int node : list.get(1))
		{
			que.add(node);
			set.add(node);
		}
		while(que.size() != 0)
		{
			int temp = que.poll();
			for(int node : list.get(temp))
			{
				set.add(node);
			}
		}
		return set.size();
	}
}
