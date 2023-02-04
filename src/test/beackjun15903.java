package test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun15903 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Long> que = new PriorityQueue<>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			que.add(sc.nextLong());
		}
		
		for(int i = 0 ; i < m ; i++)
		{
			long num1 = que.poll();
			long num2 = que.poll();
			
			que.add(num1 + num2);
			que.add(num1 + num2);
		}
		
		long result = 0;
		for(long num : que)
		{
			result += num;
		}
		System.out.println(result);
	}

}
