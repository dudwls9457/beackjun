package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class beackjun10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int num[] = new int[N];
		
		for(int i = 0 ; i < N ; i++)
		{
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		
		
		for(int value : num)
		{
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}

}
