package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class beackjun11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder stb = new StringBuilder();
		Queue<Integer> que = new LinkedList<>();
		stb.append("<");
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		
		for(int i = 1 ; i <= N ; i++)
		{
			que.add(i);
		}
		
		while(que.size() > 1)
		{
			for(int i = 0 ; i < K-1 ; i++)
			{
				int val = que.poll();
				que.offer(val);
			}
			stb.append(que.poll()).append(", ");
		}
		stb.append(que.poll()).append(">");
		System.out.println(stb);
		
	}

}
