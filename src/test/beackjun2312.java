package test;

import java.util.Scanner;

public class beackjun2312 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++ )
		{	
			int N = sc.nextInt();
			
			for(int j = 2 ; j <= N ; j++)
			{	
				int count = 0 ;
				boolean flag = true;
				while(N % j == 0)
				{	
					count++;
					N /= j;
					flag = false;
				}
				if(flag == false)
				stb.append(j + " " + count + "\n");
			}
		}
		System.out.println(stb);
	}

}
