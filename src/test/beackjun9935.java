package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class beackjun9935 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stb = new StringBuilder();
		
		String input = br.readLine();
		int inputLength = input.length();
		String check = br.readLine();
		int checkLength = check.length();
		
		Stack<Character> que = new Stack<>();
		
		for(int i = 0 ; i < inputLength ; i++)
		{
			que.add(input.charAt(i));
			
			if(que.size() >= checkLength)
			{
				boolean flag = true;
				for(int j = 0 ; j < checkLength ; j++)
				{
					if(que.get(que.size() - checkLength + j) != check.charAt(j))
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					for(int j = 0 ; j < checkLength ; j++)
					{
						que.pop();
					}
				}
			}
		}
		for(char c : que)
		{
			stb.append(c);
		}
		
		if(stb.length() == 0)
		{
			System.out.println("FRULA");
		}else
		{
			System.out.println(stb);
		}
	}

}
