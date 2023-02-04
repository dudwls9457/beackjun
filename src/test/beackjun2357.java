package test;

import java.util.Scanner;

public class beackjun2357 {
	
	static  private long[] tree;
	static long max = Long.MIN_VALUE;
	static long min = Long.MAX_VALUE;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long [] arr = new long[N + 1];
		
		for(int i = 1 ; i <= N ; i++)
		{
			arr[i] = sc.nextLong();
		}
		SegmentTree st = new SegmentTree(N);
		st.init(arr, 1, 1, N);
		
		for(int i = 0 ; i < M ; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(st.max(1, 1, N, a, b));
		}
		
	}
	
	static class SegmentTree{
	    
        SegmentTree(int n) {
            double treeHeight = Math.ceil(Math.log(n)/Math.log(2))+1;
            long treeNodeCount = Math.round(Math.pow(2, treeHeight));
            tree = new long[Math.toIntExact(treeNodeCount)];
        }

        long init(long[] arr, int node, int start, int end ){
            if (start == end) {
                return tree[node] = arr[start];
            }else{
                return tree[node] = init(arr, node*2, start, (start+end)/2)
                        + init(arr, node*2+1, (start+end)/2+1, end);
            }
        }

        long max(int node, int start, int end, int left, long right) {
            if (end < left || right < start) {
                return 0;
            } else if (left <= start && end <= right) {
            	max = Math.max(max, tree[node]);
                return max;
            } else {
            	return max(node*2, start, (start+end)/2, left, right)
                        + max(node*2+1, (start+end)/2+1, end, left, right);
            }
        }
    }
}
