package test;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun2075 {

	public static void main(String[] args) {
		
		PriorityQueue<Long> que = new PriorityQueue<>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			for(int j = 0 ; j < N ; j++)
			{
				que.add(sc.nextLong());
			}
		}
		
		for(int i = 0 ; i < N - 1 ; i++)
		{
			que.poll();
		}
		System.out.println(que.poll());
		
	}

}
