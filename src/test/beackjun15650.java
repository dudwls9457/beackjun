package test;

import java.util.Scanner;

public class beackjun15650 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] visited = new boolean[N + 1];
		int[] arr = new int[N + 1];
		
		for(int i = 1;  i <= N ; i++)
		{
			arr[i] = i;
		}
			combination(arr, visited, 1, N, M);
	}
	
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
	    if(r == 0) {
	    	print(arr, visited, n);
	        return;
	    } 

	    for(int i=start; i<=n; i++) {
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}
	
	static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i <=n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}
