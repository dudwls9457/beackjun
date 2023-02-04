package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun2161 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deque<Integer> que = new ArrayDeque<>();
		
		int N = sc.nextInt();
		
		for(int i = 1 ; i <= N ; i++)
		{
			que.add(i);
		}
		
		StringBuilder stb = new StringBuilder();
		while(que.size() != 1)
		{
			stb.append(que.pollFirst() + " ");

			int temp = que.pollFirst();
			que.add(temp);
		}
		stb.append(que.poll());
		System.out.println(stb);
	}

}
