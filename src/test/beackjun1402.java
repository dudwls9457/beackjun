package test;

import java.util.Scanner;

public class beackjun1402 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			boolean flag = false;
			if(B > A)
			{
				int temp = B;
				B = A;
				A = temp;
			}
			
			for(int j = 2 ; j < A / 2 ; j++ )
			{
				if(A % j == 0)
				{
					int div = A / j;
					if(j + div == B)
					{
						flag = true;
						System.out.println("YES");
						break;
					}
				}
			}
			if(flag == false)
				System.out.println("NO");
		}
	}

}
