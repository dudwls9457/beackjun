package test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class beackjun1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.comparingInt(x -> x));
		StringBuilder stb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++)
		{
			int input = sc.nextInt();
			if(input == 0)
			{
				if(que.isEmpty()) stb.append("0" +"\n");
				else stb.append(que.poll() +"\n");
				
			}else
			{
				que.add(input);
			}
		}
		System.out.println(stb);
		
	}

}
