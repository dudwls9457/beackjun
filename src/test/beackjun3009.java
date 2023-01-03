package test;

import java.util.Scanner;

public class beackjun3009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int save1 [] = {sc.nextInt() , sc.nextInt()};
		int save2 [] = {sc.nextInt() , sc.nextInt()};
		int save3 [] = {sc.nextInt() , sc.nextInt()};
		
		int x , y;
		
		if(save1[0] == save2[0])	x = save3[0];
		else if(save1[0] == save3[0]) x = save2[0];
		else x = save1[0];
		
		
		if(save1[1] == save2[1])	y = save3[1];
		else if(save1[1] == save3[1]) y = save2[1];
		else y = save1[1];
		
		System.out.println(x + " " + y);
	}

}
