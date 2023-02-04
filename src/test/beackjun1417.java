package test;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun1417 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		
		int N = sc.nextInt();
		int dasom = 0;

		for(int i = 0 ; i < N ; i++)
		{
			int input = sc.nextInt();
			if(i == 0) dasom = input;
			que.add(input);
		}
			
		if(N == 1 || N == 0) System.out.println(0);
		else
		{
			int count = 0;
			while(true)
			{
				int max = que.poll();
				if(max < dasom) break;
					
				que.add(max - 1);
				dasom++;
				count++;
			}
			System.out.println(count);
		}	
	}
}
