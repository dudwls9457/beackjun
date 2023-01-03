package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class beackjun5430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			String p = sc.next();
			String [] temp = new String[p.length() + 1];
			StringBuilder stb = new StringBuilder();
			int count = 1 ;
			boolean flag = false;
			stb.append("[");
			for(int j = 0 ; j < p.length() ; j++)
			{
				temp[j] = p.substring(j, j+1);
			}
			int n = sc.nextInt();
			String s = sc.next();
			String arr[] = s.split(",");
			if(n != 0)
			{
				arr[0] = arr[0].replace("[", "");
				arr[n-1] = arr[n-1].replace("]", "");
			}

			Deque<String> list = new ArrayDeque<>();
			for(int l = 0 ; l < arr.length ; l++)
			{
				list.add(arr[l]);
			}
			for(int k = 0 ; k < temp.length - 1 ; k++)
			{
				if(temp[k].equals("R"))
				{
					count++;
				}
				if(temp[k].equals("D"))
				{	
					if(count % 2 != 0)
					{
						if(list.size() != 0 && n != 0)
						{
							list.removeFirst();
						}else
						{
							System.out.println("error");
							flag = true;
							break;
						}
					}else
					{
						if(list.size() != 0 && n != 0)
						{
							list.removeLast();
						}else
						{
							System.out.println("error");
							flag = true;
							break;
						}
					}
					
				}
			}
			if(flag == false)
			{	
				int n1 = list.size() - 1;
				for(int y = 0 ; y < n1  ; y++)
				{	
					if(count % 2 != 0)
					{
						stb.append(list.pollFirst() + ",");
					}else
					{
						stb.append(list.pollLast() + ",");
					}
				}
				if(list.size() != 0 && n != 0)
				{
					stb.append(list.pollLast());
				}
				stb.append("]");
				System.out.println(stb);
			}			
		}
	}

}
