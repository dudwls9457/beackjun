package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

public class beackjun1325 {

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i = 0 ; i <= N ; i++)
		{
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < M ; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			graph.get(num2).add(num1);
		}
		int [][] result = new int[N + 1][2];
		
		for(int i = 1 ; i <= N ; i++)
		{
			result[i][0] = i;
			result[i][1] = bfs(i);
		}
		
		Arrays.sort(result, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o2[1]-o1[1]; // 두번째 숫자 기준 내림차순 {3,50}{5,40}{1,30}{4,20}{2,10}
		    }
		});
		int max = result[0][1];
		System.out.print(result[0][0] + " ");
		for(int i = 1; i <= N ; i++)
		{
			if(result[i][1] < max) break;
			System.out.print(result[i][0] + " ");
		}
	}
	
	
	public static int bfs(int i)
	{	
		Deque<Integer> que = new ArrayDeque<>();
		que.add(i);
		int count = 0;
		
		while(que.size() != 0)
		{
			for(int node : graph.get(que.poll()))
			{
				que.add(node);
				count++;
			}
		}
		return count;
	}

}
