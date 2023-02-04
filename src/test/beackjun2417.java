package test;

import java.util.Scanner;

public class beackjun2417 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long start = 0;
		long end = n;
		
		long mid = 0;
		long min = 0;
		while(start <= end)
		{
			mid = (start + end) / 2;
			long now = (long) Math.pow(mid, 2);
			
			
			if(now >= n)
			{	
				min = mid;
				end = mid - 1;
			}else
			{
				start = mid + 1;
			}
		}
		System.out.println(min);
	}

}
