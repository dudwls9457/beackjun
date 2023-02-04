package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class beackjun2910 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer[]> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder stb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int count = 1;
		for(int i = 0 ; i < N ;  i++)
		{
			int input = Integer.parseInt(st.nextToken());
			
			if(map.get(input) == null)
			{
				map.put(input, new Integer[] {count, 1});
				count++;
			}
			else
				map.put(input, new Integer[] {map.get(input)[0], map.get(input)[1] + 1});
		}
		
		List<Map.Entry<Integer, Integer[]>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort((Comparator<? super Entry<Integer, Integer[]>>) new Comparator<Map.Entry<Integer, Integer[]>>() {
		    @Override
		    public int compare(Map.Entry<Integer, Integer[]> o1, Map.Entry<Integer, Integer[]> o2) {
		    	if (o1.getValue()[1] == o2.getValue()[1]) 
		    		return Integer.compare(o1.getValue()[0], o2.getValue()[0]);
		    	else
		    		return o2.getValue()[1] - o1.getValue()[1];
		    }
		});
		for(Map.Entry<Integer, Integer[]> entry : entryList){
			for(int i = 0 ; i < entry.getValue()[1] ; i++)
			{
				stb.append(entry.getKey() + " ");
			}
		}
		System.out.println(stb);
	}

}
