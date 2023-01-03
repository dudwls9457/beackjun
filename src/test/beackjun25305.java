package test;

import java.util.Arrays;
import java.util.Scanner;

public class beackjun25305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		int score[] = new int [N];
		
		for(int i = 0 ; i < score.length ; i++)
		{
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);
		System.out.println(score[score.length - k]);
		
	}

}
