package test;

import java.util.Scanner;

public class beackjun1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(getCount(N));
		
	}
	
	public static int getCount(int N)
	{
		int count = 0 ;
			if(N  <  100)
			{
				return N;
			}else
			{
				for(int i = 100 ; i <= N ; i++)
				{
					int three = i / 100;
					int two = (i/10) % 10;
					int first = i % 10;
					
					if((three - two) == (two - first))
					{
						count++;
					}
				}
			}
			
		return count + 99;
	}

}
