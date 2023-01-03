package test;

import java.util.Scanner;

public class beackjun9020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int n = sc.nextInt();
			
			int first = n / 2;
			int second = n / 2;
			
			while(true)
			{	
				if(solve(n/2))
				{
					System.out.println(n/2 + " " + n/2);
					break;
				}else
				{
					if(solve(first) && solve(second))
					{
						System.out.println(first + " " + second);
						break;
					}
					first--;
					second++;
				}
			}
		}
	}
	public static boolean solve(int num){

        if(num < 2) return false;

        if(num == 2) return true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

}
