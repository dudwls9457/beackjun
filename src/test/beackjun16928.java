package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

import org.ietf.jgss.GSSName;

public class beackjun16928 {
	
	static int [] map = new int[101];
	static int [] snake = new int [101];
	
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt(); // 사다리의 수
		int M = sc.nextInt(); // 뱀
		
		for(int i = 0 ; i < N + M ; i++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			snake[start] = end;
		}
		System.out.println(bfs());
	}
	public static int bfs()
	{
		boolean [] visited = new boolean[101];
		Deque<Integer> que = new ArrayDeque<>();
		que.add(1);
		visited[1] = true;
		map[1] = 0;
		
		while(que.size() != 0)
		{
			int now = que.poll();
			
			for(int i = 1 ; i <= 6 ; i++)
			{
				int next = now + i;
				
				if(next >= 100) return map[next] = map[now] + 1;
				if(visited[next] == true) continue;
				
				if(snake[next] != 0)
				{
					if(visited[snake[next]] == false)
					{
						visited[snake[next]] = true;
						map[snake[next]] = map[now] + 1;
						que.add(snake[next]);
					}
				}else
				{
					visited[next] = true;
					map[next] = map[now] + 1;
					que.add(next);
				}
			}
		}
		return -1;
	}
}
