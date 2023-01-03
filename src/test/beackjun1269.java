package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class beackjun1269 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Set<Integer> Aset = new HashSet<>();
	Set<Integer> Bset = new HashSet<>();
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	for(int i = 0 ; i < A ; i++)
	{
		Aset.add(sc.nextInt());
	}
	
	int count = 0;
	for(int i = 0 ; i < B ; i++)
	{
		int temp = sc.nextInt();
		Bset.add(temp);
		if(!Aset.contains(temp)) count++;
	}
	
	for(int num : Aset)
	{
		if(!Bset.contains(num)) count++;
	}
	System.out.println(count);
		
	}

}
