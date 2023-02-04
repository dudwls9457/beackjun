package test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun1655 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		StringBuilder stb = new StringBuilder();
		for(int i = 1 ; i <= N ; i++)
		{
			int input = sc.nextInt();
			que.add(input);
			if(que.size() % 2 == 0)
			{
				for(int j = 0 ; j < que.size() / 2 ; j++)
				{
					if(j == que.size() - 1) stb.append(que.peek());
				}
			}
		}
		
	}

}
