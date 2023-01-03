package test;

import java.util.Scanner;

public class beackjun2805 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int tree[] = new int[N];
		
		int min = 0;
		int max = 0;
		int mid = 0;
		
		for(int i = 0 ; i < N ; i++)
		{
			tree[i] = sc.nextInt();
			if(tree[i] > max) max = tree[i];
		}
		
		while(min < max)
	      {
	         mid = (min + max) / 2;
	         
	         long sum = 0;
	         for(int length : tree)
	         {
	            if(length  > mid) sum += (length - mid);
	         }
	         
	         if(sum < M)
	         {
	            max = mid;
	         }else
	         {

	             min = mid + 1;
	         }
	      }
	      System.out.println(min - 1);

		
	}

}
