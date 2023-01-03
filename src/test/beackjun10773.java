package test;

import java.util.Scanner;
import java.util.Stack;

public class beackjun10773 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		for(int i = 0 ; i < K ; i++)
		{
			int temp = sc.nextInt();
			
			if(temp == 0) stack.pop();
			else stack.add(temp);
		}
		
		int sum = 0;
		for(int i = 0 ; i < stack.size() ; i++)
		{
			sum += stack.get(i);
		}
		System.out.println(sum);
	}

}
