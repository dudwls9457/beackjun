package test;

import java.util.Scanner;
import java.util.Stack;

public class beackjun1874 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int start = 0 ;
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			int input = sc.nextInt();
			
			if(input > start)
			{	
				for(int j = start + 1 ; j <= input ; j++)
				{
					stack.push(j);
					stb.append("+\n");
				}
				start = input;
			}
			else if(stack.peek() != input)
			{
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			stb.append("-\n");
		}
		System.out.println(stb);

	}

}
