package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class beackjun1448 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Integer [] length = new Integer[N];
		
		for(int i = 0 ; i < N ; i++)
		{
			length[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(length , Collections.reverseOrder());

		int max = -1;
		
		for(int i = 0 ; i < N - 2 ; i++)
		{
			if(length[i] < length[i+1] + length[i+2])
			{
				max = length[i] + length[i+1] + length[i+2];
				break;
			}
		}
		System.out.println(max);
	}
}
