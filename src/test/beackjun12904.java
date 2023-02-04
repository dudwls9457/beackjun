package test;

import java.util.Scanner;

public class beackjun12904 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer S = new StringBuffer(sc.next());
		StringBuffer T = new StringBuffer(sc.next());
		
		
		while(true)
		{
			if(T.length() == S.length()) break;
			
			if(T.charAt(T.length() - 1) == 'A')
			{
				T.deleteCharAt(T.length() - 1);
			}else
			{
				T.deleteCharAt(T.length() - 1);
				T.reverse();
			}
		}
		
		String tempT = T.substring(0);
		String tempS = S.substring(0);
		
		if(tempT.equals(tempS)) System.out.println(1);
		else System.out.println(0);
	}
}
