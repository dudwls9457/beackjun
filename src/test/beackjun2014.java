package test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun2014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Long> que = new PriorityQueue<>();
		
		int K = sc.nextInt();
		int N = sc.nextInt();
		
		long [] arr = new long [K];
		
		for(int i = 0 ; i < K ; i++)
		{
			arr[i] = sc.nextLong();
			que.add(arr[i]);
		}
		
		long ans = 0;
		while (N-- > 0) 
		{		
			ans = que.poll();
			 
            for (int j = 0; j < K; j++) {
                if ((ans * arr[j]) >= ((long) 2 << 30)) {
                    break;
                }
 
                que.add(ans * arr[j]);
 
                if (ans % arr[j] == 0) {
                    break;
                }
            }
		}
		System.out.println(ans);
	}

}
