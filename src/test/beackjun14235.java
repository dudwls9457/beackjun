package test;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun14235 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder stb = new StringBuilder();
		for(int i = 0 ; i < n ; i++)
		{
			int a = sc.nextInt();
			
			if(a == 0)
			{
				if(que.size() != 0) stb.append(que.poll()+"\n");
				else stb.append(-1+"\n");
			}else
			{
				for(int j = 0 ; j < a ; j++)
				{
					que.add(sc.nextInt());
				}
			}
		}
		System.out.println(stb);
	}
}
