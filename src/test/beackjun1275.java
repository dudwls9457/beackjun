package test;

import java.util.Scanner;

public class beackjun1275 {
	
	static  private long[] tree;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		long arr [] = new long [N + 1];
		for(int i = 1 ; i <= N ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		SegmentTree st = new SegmentTree(N);
		st.init(arr, 1, 1, N);
		
		for(int i = 0 ; i < Q ; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(x > y)
			{
				int temp = y;
				y = x;
				x = temp;
			}
			
			System.out.println(st.sum(1, 1, N, x, y));
			st.update2(1,1, N, a, b);
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

        long sum(int node, int start, int end, int left, int right) {
            if (end < left || right < start) {
                return 0;
            } else if (left <= start && end <= right) {
                return tree[node];
            } else {
                return sum(node*2, start, (start+end)/2, left, right)
                        + sum(node*2+1, (start+end)/2+1, end, left, right);
            }
        }

        long update2(int node, int start, int end, int index, long changeValue) {
            if (index < start || end < index) {

                return tree[node];
            } else if (start == index && end == index) {

                return tree[node] = changeValue;
            } else {

                return tree[node] = update2(node * 2, start, (start + end) / 2, index, changeValue) +
                        update2(node * 2 + 1, (start + end) / 2 + 1, end, index, changeValue);
            }
        }
    }

}
