package test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun1715 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			que.add(sc.nextInt());
		}
		
		long count = 0;
		while(que.size() != 0)
		{
			int num1 = que.poll();
			int num2 = 0;
			if(que.peek() != null)
				num2 = que.poll();
			else break;
			
			count += num1 + num2;
			que.add(num1 + num2);	
		}
		System.out.println(count);
	}

}
