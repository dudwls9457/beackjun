package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		que.poll();

		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		String temp = String.valueOf(n);
		
		Integer [] arr = new Integer[temp.length()];
		for(int i = 0 ; i < temp.length() ; i++)
		{
			arr[i] = (int) temp.charAt(i) - 48;
		}

		for(int i = 0 ; i < temp.length(); i++)
		{
			for(int j = 0 ; j < temp.length() - 1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int tempo = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempo;
				}
			}
		}
		String result = "";
		for(int i = 0 ; i < temp.length() ; i++)
		{
			result += String.valueOf(arr[i]);
		}
		long answer = Long.valueOf(result);
		System.out.println(answer);
	}

}
