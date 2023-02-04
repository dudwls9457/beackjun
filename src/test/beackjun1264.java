package test;

import java.util.Scanner;

public class beackjun1264 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String input = sc.nextLine();
			if(input.equals("#")) break;
			
			int count = 0;
			
			for(int i = 0 ; i < input.length() ; i++)
			{
				char c = input.charAt(i);
				
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
					count++;
			}
			System.out.println(count);
		}
	}

}
