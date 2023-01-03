package test;

import java.util.HashSet;
import java.util.Scanner;

public class beackjun11723 {
	
	public static HashSet<Integer> set;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		int M = sc.nextInt();
		set = new HashSet<>();
		
		for(int i = 0 ; i < M ; i++)
		{
			String temp = sc.next();
			
			switch(temp)
			{
				case "add":
					add(sc.nextInt());
					break;
				case "check":
					stb.append(check(sc.nextInt()) + "\n");
					break;
				case "remove":
					remove(sc.nextInt());
					break;
				case "toggle":
					toggle(sc.nextInt());
					break;
				case "all":
					all();
					break;
				case "empty":
					empty();
					break;
			}
		}
		System.out.println(stb);
		
	}
	
	public static void add(int num)
	{
		set.add(num);
	}
	
	public static int check(int num)
	{
		if(set.contains(num)) return 1;
		else return 0;
	}
	
	public static void remove(int num)
	{
		if(set.contains(num)) set.remove(num);
	}
	public static void toggle(int num)
	{
		if(set.contains(num)) set.remove(num);
		else set.add(num);
	}
	public static void all()
	{
		for(int i = 1 ; i <= 20 ; i++)
		{
			set.add(i);
		}
	}
	
	public static void empty()
	{
		set.clear();
	}

}
