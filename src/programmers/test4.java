package programmers;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int storey = sc.nextInt();
		
		int sum = 0;
		while(storey > 0)
		{
			int temp = storey % 10;
			
				if(temp > 5)
				{
					sum += 10 - temp;
					storey /= 10;
					if(storey > 0)
					storey++;
					else
						sum++;
				
				}else if(temp == 5 && (storey / 10) % 10 >= 5)
				{
					sum += 10 - temp;
					storey /= 10;
					if(storey > 0)
					storey++;
					else
						sum++;
				}
				else
				{
					sum += temp;
					storey /= 10;
				}	
			
		}
		System.out.println(sum);
	}

}
