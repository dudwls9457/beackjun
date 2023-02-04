package test;

import java.util.Scanner;
import java.util.Stack;

public class beackjun17413 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder stb = new StringBuilder();
		boolean flag = false;
		
		for(int i = 0 ; i < S.length() ; i++)
		{
			char c = S.charAt(i);
			boolean flagv = false;
			
			if(c == ' ')
			{	
				while(stack.size() != 0)
				{
					stb.append(stack.pop());
				}
				stb.append(' ');
				flagv = true;
			}else if(c == '<')
			{
				flag = true;
				while(stack.size() != 0)
				{
					stb.append(stack.pop());
				}
				stb.append('<');
			}else if(c == '>')
			{
				stb.append('>');
				flag = false;
			}
			
			if(flag == true && c != '<' && flagv != true)
			{
				stb.append(c);
			}else if(flag == false && c != '>' && flagv != true)
			{
				stack.add(c);
			}
			if(i == S.length() - 1)
			{
				while(stack.size() != 0)
				{
					stb.append(stack.pop());
				}
			}
		}
		System.out.println(stb);
	}
}
