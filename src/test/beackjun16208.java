package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beackjun16208 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long [] input = new long[n];
		long sum = 0;
		long result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++)
		{
			input[i] = Long.parseLong(st.nextToken());
			sum += input[i];
		}

		for(int i = 0 ; i < n ; i++)
		{
			sum -= input[i];
			result += input[i] * sum;
			
		}
		System.out.println(result);
	}

}
