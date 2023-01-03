package test;

import java.util.Scanner;

public class beackjun11047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int coin[] = new int[N];
		int count = 0;
		for(int i = 0 ; i < N ; i++)
		{
			coin[i] = sc.nextInt();
		}
		
		for(int i = N - 1 ; i >= 0 ; )
		{
			if(K - coin[i] >= 0)
			{
				count++;
				K = K - coin[i];
				if(K == 0) break;
			}else
			{
				i--;
			}
		}
		System.out.println(count);

	}

}
