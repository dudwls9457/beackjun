package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun1374 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arrays[][] = new int[N][2];
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			arrays[i][0] = sc.nextInt();
			arrays[i][1] = sc.nextInt();

		}
		
		Arrays.sort(arrays, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]); // 2차원 배열 뒤에 수로 정렬
		
		int ans = 0;
		
		for(int i = 0 ; i < N ; i++)
		{	
			priorityQueue.add(arrays[i][1]);
			while(priorityQueue.size() != 0)
			{
				if(priorityQueue.peek() > arrays[i][0]) break;
				else priorityQueue.poll();
			}
			priorityQueue.add(arrays[i][1]);
			ans = Math.max(priorityQueue.size() , ans);
		}
		System.out.println(ans);
	}

}
