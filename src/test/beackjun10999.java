package test;

import java.util.Scanner;

public class beackjun10999 {
	
	static  private long[] tree;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 배열에 담을 숫자의 갯수
		int M = sc.nextInt(); // 변경
		int K = sc.nextInt(); // 더한 값
		
		long [] arr = new long[N + 1];
		for(int i = 1 ; i <= N ; i++)
		{
			arr[i] = sc.nextLong();
		}
		
		SegmentTree st = new SegmentTree(N);
		st.init(arr, 1, 1, N);
		
		for(int i = 0 ; i < M + K ; i++)
		{
			int a = sc.nextInt();
			if(a == 1)
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				long d = sc.nextInt();
				for(int j = b ; j <= c ; j++)
					st.update2(1, 1, N, j, d);
			}
			if(a == 2)
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println(st.sum(1, 1, N, b, c));
			}
				
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

        long sum(int node, int start, int end, int left, long c) {
            if (end < left || c < start) {
                return 0;
            } else if (left <= start && end <= c) {
                return tree[node];
            } else {
                return sum(node*2, start, (start+end)/2, left, c)
                        + sum(node*2+1, (start+end)/2+1, end, left, c);
            }
        }

        long update2(int node, int start, int end, int index, long changeValue) {
            if (index < start || end < index) {

                return tree[node];
            } else if (start == index && end == index) {

                return tree[node] += changeValue;
            } else {
                return tree[node] = update2(node * 2, start, (start + end) / 2, index,  changeValue) +
                        update2(node * 2 + 1, (start + end) / 2 + 1, end, index,  changeValue);
            }
        }
    }

}
