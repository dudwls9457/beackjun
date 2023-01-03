package test;

import java.util.Scanner;

public class beackjun2920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int getNum [] = new int [9];
		
		int j = 8;
		boolean check = false;
		for(int i = 1 ; i < 9 ; i++)
		{
			getNum[i] = sc.nextInt();
		}
		if(getNum[1] == 1)
		{
			for(int i = 1 ; i < 9 ; i++)
			{
				if(getNum[i] != i) check = true;
			}
			if(check == false) System.out.println("ascending");
			else System.out.println("mixed");
		}else
		{
			for(int i = 1 ; i < 9 ; i++)
			{	
				if(getNum[i] != j) check = true;
				j--;
			}
			if(check == false) System.out.println("descending");
			else System.out.println("mixed");
		}
		
	}

}
