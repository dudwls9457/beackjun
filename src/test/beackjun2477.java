package test;

import java.util.Scanner;

public class beackjun2477 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		int getNum[][] = new int[6][2];
		
		int w = 0 , h = 0;
		int maxW = 0 , maxH = 0;
		getNum[0][0] = sc.nextInt();
		getNum[0][1] = sc.nextInt();
		
		int sum = 0;
		for(int i = 1 ; i < 6 ; i++)
		{
			getNum[i][0] = sc.nextInt();
			getNum[i][1] = sc.nextInt();
			sum += getNum[i-1][1] * getNum[i][1];
		}
		sum += getNum[5][1] * getNum[0][1];
		for(int i = 0 ; i < 6 ; i++)
		{
			if(getNum[i][0] == 1 || getNum[i][0] == 2)
			{
				// 가로일 경우
				if(getNum[i][1] > maxW)
				{
					maxW = getNum[i][1];
				}
			}else if(getNum[i][0] == 3 || getNum[i][0] == 4)
			{
				// 세로일 경우
				if(getNum[i][1] > maxH)
				{
					maxH = getNum[i][1];
				}
	
			}
		}
		System.out.println(((maxH * maxW) - ((maxH * maxW) * 3 - sum)) * K); // 3x + 2y 

	}

}
