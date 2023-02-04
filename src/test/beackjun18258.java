package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class beackjun18258 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Deque<Integer> que = new ArrayDeque<>();
		StringBuilder stb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++)
		{
			String order = sc.next();
			
			switch(order)
			{
				case "push" :
					int num = sc.nextInt();
					que.addLast(num);
					break;
				case "pop" : 
					if(que.size() != 0)
					{
						stb.append(que.pollFirst() + "\n");
					}else
					{
						stb.append(-1 + "\n");
					}
					break;
				case "size" :
					stb.append(que.size() + "\n");
					break;
				case "empty" :
					if(que.size() == 0)
					{
						stb.append(1 + "\n");
					}else
					{
						stb.append(0 + "\n");
					}
					break;
				case "front" :
					if(que.size() != 0)
					{
						stb.append(que.peekFirst() + "\n");
					}else
					{
						stb.append(-1 + "\n");
					}
					break;
				case "back" :
					if(que.size() != 0)
					{
						stb.append(que.peekLast() + "\n");
					}else
					{
						stb.append(-1 + "\n");
					}
			}
		}
		System.out.println(stb);
	}

}
