package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class beackjun11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int xy[][] = new int[N][2];
		
		for(int i = 0 ; i < N ; i++)
		{
			xy[i][1] = sc.nextInt();
			xy[i][0] = sc.nextInt();
		}
		
		Arrays.sort(xy, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                	 return o1[1] - o2[1];
		    	 }else {
		    		 return o1[0] - o2[0]; 
		    	 }
	           }
	        });
		
		for(int i = 0 ; i < N ; i++)
		{
			System.out.println(xy[i][1] + " " + xy[i][0]);
		}

	}

}
