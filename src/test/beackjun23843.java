package test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun23843 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			que.add(sc.nextInt());
		}
	}

}
