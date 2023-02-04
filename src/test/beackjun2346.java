package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun2346 {

	public static void main(String[] args) {
		
		Deque<int []> que = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] save = new int[N];
		
		for(int i = 1 ; i <= N ; i++)
		{
			que.add(new int[] {sc.nextInt() , i});
		}
		
		int count = 0;
		while(que.size() != 1)
		{
			int next [] = que.pollFirst();
			save[count] = next[1];
			count++;
			
			if(next[0] > 0)
			{
				for(int i = 0 ; i < next[0] - 1 ; i++)
					que.addLast(que.pollFirst());		
			}else
			{
				for(int i = 0 ; i < Math.abs(next[0]) ; i++)
					que.addFirst(que.pollLast());
			}
		}
		save[count] = que.poll()[1];
		for(int i = 0 ; i < save.length ; i++)
		{
			System.out.print(save[i] + " ");
		}
	}

}
