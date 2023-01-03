package test;

import java.util.Scanner;
import java.util.Stack;

public class beackjun9012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
	
		Stack<String> stack;
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			String str = sc.next();
			stack = new Stack<>();
			boolean flag = true;
			for(int j = 0 ; j < str.length() ; j++)
			{
				if(str.charAt(j) == '(')
					stack.push("(");
				else {
					if(!stack.empty()) stack.pop();
					else 
					{
						stb.append("NO" + "\n");
						flag = false;
						
					}
				}
			}
			if(flag == true)
			{
				if(stack.empty())stb.append("YES" + "\n");
				else stb.append("NO" + "\n");	
			}
			System.out.println(1);
		}
		System.out.println(stb);
	}

}
