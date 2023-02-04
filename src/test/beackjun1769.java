package test;

import java.util.Scanner;

public class beackjun1769 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String X = sc.next();
		
		int count;
		boolean flag = false;
		
		if(X.length() == 1)
		{
			count = 0;
			int temp = (int) X.charAt(0) - 48;
			if(temp == 3 || temp == 6 || temp == 9)
			{
				flag = true;
			}
		}else
		{	
			count = 1;
			while(true)
			{
				
				int sum = 0;
				for(int i = 0 ; i < X.length() ; i++)
				{
					sum += (int) X.charAt(i) - 48;
				}
				if(sum == 3 || sum == 6 || sum == 9)
				{
					flag = true;
					break;
				}
				if(sum < 10)
					break;
				X = sum + "";
				count++;
			}
		}	
		if(flag == false)
			System.out.println(count + "\n" + "NO");
		else
			System.out.println(count + "\n" + "YES");
	}

}
