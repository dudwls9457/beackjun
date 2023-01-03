package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class beackjun1181 {

	public static void main(String[] args) {
		
		// 문자열 길이를 통해서 정렬해주는 comparator
		Comparator<String> c = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String> list = new LinkedList<>();
		
		for(int i = 0 ; i < N ; i++)
		{
			list.add(i, sc.next());
		}
		List<String> result = new LinkedList<>(new HashSet<String>(list)); // list 속 중복 제거
		
		Collections.sort(result);
		// 위에 선언한 comparator을 사용하여 정렬 
		Collections.sort(result, c);
		
		for(int i = 0 ; i < result.size() ; i++)
		{
			System.out.println(result.get(i));
		}
		
	}


}
