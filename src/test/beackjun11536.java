package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class beackjun11536 {
	
	static String name[];
	static String down[];
	static String up[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		name = new String[N];
		down= new String[N];
		up = new String[N];
		
		for(int i = 0 ; i < N ; i++)
		{
			name[i] = sc.next();
			down[i] = name[i];
			up[i] = name[i];
		}
		
		Arrays.sort(down);
		Arrays.sort(up , Collections.reverseOrder());
		
		if(checkUp(N)) System.out.println("DECREASING");
		else if(checkDown(N)) System.out.println("INCREASING");
		else System.out.println("NEITHER");
	}
	public static boolean checkDown(int N)
	{
		for(int i = 0 ; i < N ; i++)
		{
			if(!name[i].equals(down[i])) return false;
		}
		return true;
	}
	public static boolean checkUp(int N)
	{
		for(int i = 0 ; i < N ; i++)
		{
			if(!name[i].equals(up[i])) return false;
		}
		return true;
	}
}
