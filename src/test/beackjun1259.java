package test;

import java.util.Scanner;

public class beackjun1259 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		while(true)
		{
			int N = sc.nextInt();
			if(N == 0) break;
			
			String temp = String.valueOf(N);
			boolean check = true;
			
			
			for(int i = 0 ; i < temp.length() / 2 ; i++)
			{
				if(temp.charAt(i) != temp.charAt(temp.length() - i - 1)) check = false;
			}
			
			if(check == true) System.out.println("yes");
			else System.out.println("no");
			
		}
	}

}
