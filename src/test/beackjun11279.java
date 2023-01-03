package test;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun11279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			int temp = sc.nextInt();
			if(temp == 0)
			{
				if(que.size() == 0) stb.append(0 +"\n");
				else stb.append(que.poll() +"\n");
			}else
			{
				que.add(temp);
			}
		}
		System.out.println(stb);
		
	}

}
