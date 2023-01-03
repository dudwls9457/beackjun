package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class beackjun2751 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < N ; i++)
		{
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list)
		{
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}

}
