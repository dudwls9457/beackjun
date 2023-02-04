package test;

import java.util.Scanner;

public class beackjun2083 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder stb = new StringBuilder();
		while(true)
		{
			String name = sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();
			
			if(name.equals("#")) break;
			stb.append(name);
			if(age > 17 || weight >= 80) stb.append(" Senior\n");
			else stb.append(" Junior\n");		
		}
		System.out.println(stb);
	}

}
