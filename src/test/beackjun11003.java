package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class beackjun11003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<int []> que = new ArrayDeque<>();
		
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		StringBuilder stb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++)
		{
			int temp = Integer.parseInt(st.nextToken());
			
			while(que.size() != 0 && que.peekLast()[0] > temp) que.pollLast(); // 받은 값보다 크면 빼버림
			
			que.add(new int[] {temp, i});
			if(que.peek()[1] < i - (L - 1)) que.poll(); // 범위밖이면 빼버림
			stb.append(que.peek()[0] + " ");
		}
		System.out.println(stb);
		
	}

}
