package test;

import java.util.Scanner;

public class beackjun1003 {

	static Integer dp_zero[] = new Integer[41];
	static Integer dp_one[] = new Integer[41];
	
	public static void main(String[] args) {
		
		StringBuilder stb = new StringBuilder();
		dp_zero[0] = 1;
		dp_zero[1] = 0;
		dp_zero[2] = 1;
		dp_one[0] = 0;
		dp_one[1] = 1;
		dp_one[2] = 2;
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int N = sc.nextInt();
			if(N == 0)
			{	
				stb.append(dp_zero[0] + " " + dp_one[0] +"\n");
			}
			else if(N == 1)
			{
				stb.append(dp_zero[1] + " " + dp_one[1] +"\n");
			}else
			{
				fibo_zero(N);
				fibo_one(N);
				stb.append(dp_zero[N] + " " + dp_one[N-1] +"\n");
			}
		}
		System.out.println(stb);
		
		
	}
	
	public static Integer fibo_zero(int N)
	{
		
		if(dp_zero[N] == null)
		{	
			dp_zero[N] = fibo_zero(N - 1) + fibo_zero(N - 2);
		}
		return dp_zero[N]; 
	}
	
	public static Integer fibo_one(int N)
	{
		
		if(dp_one[N] == null)
		{	
			dp_one[N] = fibo_one(N - 1) + fibo_one(N - 2);
		}
		return dp_one[N]; 
	}
	
}
