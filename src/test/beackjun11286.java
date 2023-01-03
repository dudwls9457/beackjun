package test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun11286 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) > Math.abs(o2))
				{
					return Math.abs(o1) - Math.abs(o2);
				}else if(Math.abs(o1) == Math.abs(o2))
				{
					return o1 - o2;
				}else return -1;
			}
		});
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int T = sc.nextInt();
		for(int i = 0 ; i < T ; i++)
		{
			int temp = sc.nextInt();
			if(temp == 0)
			{
				if(que.size() != 0) stb.append(que.poll() + "\n");
				else stb.append(0 + "\n");
			}else
			{
				que.add(temp);
			}
		}
		System.out.println(stb);
	
		
	}

}
