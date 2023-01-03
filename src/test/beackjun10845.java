package test;

import java.util.Scanner;

public class beackjun10845 {
	
	public static int que [];
	public static int size = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		StringBuilder stb = new StringBuilder();
		que = new int[N*N];
		
		for(int i = 0 ; i < N ; i++)
		{
			String order = sc.next();
			
			switch (order) {
			case "push": 
				push(sc.nextInt());
				break;
			case "pop":
				stb.append(pop() + "\n");
				break;
			case "size":
				stb.append(size() + "\n");
				break;
			case "empty":
				stb.append(empty() + "\n");
				break;
			case "front":
				stb.append(front() + "\n");
				break;
			case "back":
				stb.append(back() + "\n");
			}
		}
		System.out.println(stb);
		
		
	}
	
	public static void push(int num)
	{
		que[size] = num;
		size++;
	}
	
	public static int pop()
	{
		if(size == 0) return -1;
		else
		{	
			int i = 0;
			while(true)
			{
				if(que[i] != 0)
				{
					int res = que[i];
					que[i] = 0;
					size--;
					return res;
				}
				i++;
			}
		}	
	}
	public static int size()
	{
		return size;
	}
	public static int empty()
	{
		if(size == 0 ) return 1;
		else return 0;
	}
	
	public static int front()
	{
		if(size == 0 ) return -1;
		else return que[0];
	}
	public static int back()
	{
		if(size == 0) return -1;
		else return que[size - 1];
	}
}
