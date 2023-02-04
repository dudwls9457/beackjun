package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun1202 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			int M = sc.nextInt(); // 무게
			int V = sc.nextInt(); // 값어치
			
			map.put(V, M);
		}
		long max = 0;
		
		Integer [] bag = new Integer[K];
		
		for(int i = 0 ; i < K ; i++)
		{
			bag[i] = sc.nextInt();
		}
		
		Arrays.sort(bag); // 2 4 7 9 
		
		for(int i = 0 ; i < K ; i++)
		{
			
			while(que.size() != 0)
			{	
				int value = que.poll();
				int size = map.get(value);
				if(bag[i] >= size)
				{
					max += value;
					break;
				}
			}
		}
		System.out.println(max);
		
	}

}
