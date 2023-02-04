package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class beackjun11256 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder stb = new StringBuilder();
		for(int i = 0 ; i < T ; i++)
		{
			int j = sc.nextInt();
			int N = sc.nextInt();

			Integer [] n = new Integer [N];
			for(int k = 0 ; k < N ; k++)
			{
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				n[k] = num1 * num2;
			}
			Arrays.sort(n,Collections.reverseOrder());
			
			int count = 0;
			int l = 0;
			while(j > 0)
			{
				j -= n[l];
				count++;
				l++;
			}
			stb.append(count+"\n");
		}
		System.out.println(stb);
		
	}

}
