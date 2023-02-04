package programmers;

import java.util.*;
public class test {
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		HashMap<String, Integer> map = new HashMap<>();
		Deque<Integer> q = new ArrayDeque<>();
		map.containsKey(q);
		
		PriorityQueue<Integer> qu = new PriorityQueue<>();
		
		list.add(new ArrayList<>());
		PriorityQueue <int []> que = new PriorityQueue<>(new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0]==o2[0]) return o1[1]-o2[1];
				return o1[0]-o2[0];
			}
		 });
		
		HashSet<Character> set = new HashSet<>();
		int answer = Integer.MAX_VALUE;
		set.contains('s');
		String s = "233";
		que.add(new int[] {-20,-15});
		que.add(new int[] {-14,-5});
		que.add(new int[] {-18,-13});
		que.add(new int[] {-5,-3});
		System.out.println(que.poll()[0]);
		System.out.println(que.poll()[0]);
		System.out.println(que.poll()[0]);
	}
	public static class position{
		int x, y;

		public position(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		
	}
	 
}
