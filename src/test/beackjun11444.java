package test;

import java.util.Scanner;

public class beackjun11444
{

   public static void main(String[] args) 
   {

       double[][] matrix1 = { { 0, 1 }, { 1, 1 } }; //피보나치 행렬
       double[][] matrix2 = { { 0, 1 }, { 1, 1 } };
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        num--;
       	double [][] matrix3 = matrixMul(matrix1, matrix2);
       	if(num <= 2)
       	{
       		System.out.println(1);
       		return;
       	}
       	if(num == 3)
       	{
       		System.out.println(matrix3[1][1]);       
       	}else 	
       	{
       			matrix3 = pow(matrix1, num); // 함수 호출
       			System.out.println(matrix3[1][1] % 1000000007);
       	}
       sc.close();
   }
   
   private static double[][] matrixMul(double[][] matrix1, double[][] matrix2)
   {
	   double[][] resultMatrix = new double[2][2];

       for (int j = 0; j < 2; j++)
       {
          for (int i = 0; i < 2; i++) 
          {
            resultMatrix[j][i] = matrix1[j][0] * matrix2[0][i]+ matrix1[j][1] * matrix2[1][i];
          }
       }
       return resultMatrix;
   } // 행렬의 곱
   
	private static double[][] pow(double a[][], double num) 
	{
		double matrix[][] = {{1,0},{0,1}}; // 단위 행렬
		if(num % 2 == 0) 
		{  // 지수 : 짝수
			if(num > 0) 
			{  // 지수가 0이상인지
				num = num / 2;
				return pow(matrixMul(a,a), num); //재귀함수
			}
			else 
			{
				return matrix; // 0이하면 단위행렬 리턴
			}
		}else 
		{
			if(num > 0) 
			{ // 지수 : 홀수
				num = num / 2;
				return matrixMul(pow(matrixMul(a, a), num), a); // 제곱하고 한번더 곱함
			}else
			{
				return matrix; 
			}
		}
	}
}