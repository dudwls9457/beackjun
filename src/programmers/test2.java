package programmers;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int left = sc.nextInt();
		int right = sc.nextInt();
		int answer = 0;
		
		for(int i = left ; i <= right ; i++)
		{
			int count = 0;
			for(int j = 1 ; j < i ; j++)
			{
				if(i % j == 0) count++;
			}
			if(count % 2 == 0) answer -= i;
			else answer += i;
		}
		System.out.println(answer);
	}

}
