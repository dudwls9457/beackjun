package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class beackjun1541 {

	public static void main(String[] args) {
		
		int sum = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.next() , "-");
		
		
		while(st.hasMoreTokens())
		{
			int temp  = 0;
			
			StringTokenizer st2 = new StringTokenizer(st.nextToken() ,"+");
			
			while(st2.hasMoreTokens())
			{
				temp += Integer.parseInt(st2.nextToken());
			}
			
			if( sum == Integer.MAX_VALUE)
			{
				sum = temp;
			}else
			{
				sum -= temp;
			}
		}
		System.out.println(sum);
		
	}

}
