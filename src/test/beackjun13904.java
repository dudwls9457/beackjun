package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class beackjun13904 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int input[][] = new int [n][2];
		PriorityQueue<Integer> que = new PriorityQueue<>();
	
		for(int i = 0 ; i < n ; i++)
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			input[i][0] = num1;
			input[i][1] = num2;
		 
		}
		
		Arrays.sort(input, new Comparator<int[]>() { 
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[1]!=o2[1] ? o2[1]-o1[1] : o2[0]-o1[0]; // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
		    }
		});
		
		
		
		
	}

}
