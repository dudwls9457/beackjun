package test;

import java.util.Scanner;

public class beackjun1157 {

	public static void main(String[] args) {
			
		int [] temp = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
		boolean flag = false;
		int max = -1 ;
		int check = 0;
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String lower = str.toLowerCase();
		for(int i = 0 ; i < lower.length() ; i++)
		{
			char ch = lower.charAt(i);
			int num = (int)ch - 97;
			temp[num]++;
		}
		
		for(int i = 0 ; i < temp.length ; i++)
		{
			if(temp[i] > max)
			{
				max = temp[i];
				check = i;
			}else if(temp[i] == max && max != -1)
			{
				flag = true;
			}
		}
		if(flag == true)
		{
			System.out.println("?");
		}else
		{
			System.out.println((char)(check + 65));
		}

	}

}
