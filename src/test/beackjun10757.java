package test;

import java.util.Scanner;

public class beackjun10757 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstNum = sc.next();
		String secondNum = sc.next();
		String result = "";
		String print = "";
		boolean flag = false;
		
		int firstNumlength = firstNum.length();
		int secondNumlength = secondNum.length();
		
		if(firstNumlength >= secondNumlength)
		{
			for(int i = 0 ; i < secondNumlength ; i++)
			{	
				String first = firstNum.substring(firstNumlength - (i+1), firstNumlength - i);
				String second = secondNum.substring(secondNumlength - (i+1), secondNumlength - i);
				int temp = Integer.parseInt(first)  + Integer.parseInt(second);
				
				if(flag == false)
				{	
					if(temp >= 10)
					{
						result += temp % 10 + "";
						flag = true;
					}else
					{
						result += temp % 10 + "";
					}
				}else
				{
					if(temp >= 10)
					{
						result += (temp % 10 + 1) + "";
					}else
					{
						result += (temp % 10 + 1) + "";
						flag = false;
					}
				}
			}
			for(int i = 0 ; i < firstNumlength - secondNumlength ; i++)
			{
				if(flag == true)
				{
					result += (Integer.parseInt(firstNum.substring((firstNumlength - secondNumlength - (i + 1)), firstNumlength - secondNumlength - i)) + 1) + "" ;
					if(Integer.parseInt(firstNum.substring((firstNumlength - secondNumlength - (i + 1)), firstNumlength - secondNumlength - i)) + 1 >= 10) flag = true;
				}else
				{
					result += firstNum.substring((firstNumlength - secondNumlength - (i + 1)), firstNumlength - secondNumlength - i);
				}
			}
			if(firstNumlength == secondNumlength && flag == true) 
			{
				result += "1";
			}
		}else
		{
			for(int i = 0 ; i < firstNumlength ; i++)
			{	
				String first = firstNum.substring(firstNumlength - (i+1), firstNumlength - i);
				String second = secondNum.substring(secondNumlength - (i+1), secondNumlength - i);
				int temp = Integer.parseInt(first)  + Integer.parseInt(second);
				
				if(flag == false)
				{	
					if(temp >= 10)
					{
						result += temp % 10 + "";
						flag = true;
					}else
					{
						result += temp % 10 + "";
					}
				}else
				{
					if(temp >= 10)
					{
						result += (temp % 10 + 1) + "";
					}else
					{
						result += (temp % 10 + 1) + "";
						flag = false;
					}
				}
			}
			for(int i = 0 ; i < secondNumlength - firstNumlength ; i++)
			{
				if(flag == true)
				{
					result += (Integer.parseInt(firstNum.substring((secondNumlength - firstNumlength - (i + 1)), secondNumlength - firstNumlength - i)) + 1) + "" ;
					if(Integer.parseInt(firstNum.substring((secondNumlength - firstNumlength - (i + 1)), secondNumlength - firstNumlength - i)) + 1 >= 10) flag = true;
				}else
				{
					result += firstNum.substring((secondNumlength - firstNumlength - (i + 1)), secondNumlength - firstNumlength - i);
				}
			}
			if(firstNumlength == secondNumlength && flag == true) 
			{
				result += "1";
			}
		}
			
		for(int i = result.length() - 1 ; i >= 0 ; i--)
		{
			print += result.charAt(i);
		}
		System.out.println(print);

	}

}
