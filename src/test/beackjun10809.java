package test;

import java.util.Scanner;

public class beackjun10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		int [] temp = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
		boolean check[] = new boolean[] {
				false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,
				false,false,false,false,false,false,false
		};
		
		for(int i = 0 ; i < S.length() ; i++)
		{
			char ch = S.charAt(i);
			int num = (int)ch - 97;
			if(check[num] == false)
			{
				temp[num] = i;
				check[num] = true;
			}
		}
		for(int i = 0 ; i < temp.length ; i++)
		{
			System.out.print(temp[i]+ " ");
		}
	}

}
