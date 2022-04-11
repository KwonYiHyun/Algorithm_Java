package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 보석도둑 {
	
	static PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	static ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str=null;
		int n,k;
		int sum=0;
		int max=0;
		str=new StringTokenizer(br.readLine(), " ");
		n=Integer.parseInt(str.nextToken());
		k=Integer.parseInt(str.nextToken());
		
		
		int m[][]=new int[n][2];
		
		// 300000
		for (int i = 0; i < n; i++) {
			str=new StringTokenizer(br.readLine(), " ");
			m[i][0]=Integer.parseInt(str.nextToken());
			m[i][1]=Integer.parseInt(str.nextToken());
		}
		
		// 300000
		for (int i = 0; i < k; i++) {
			int c=Integer.parseInt(br.readLine());
			if(max<c) max=c;
			pq.add(c);
		}
		
		Arrays.sort(m, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1]-o1[1];
			}
		});
		
		// 300000
		ArrayList<Integer> ar=null;
		for (int i = 0; i < n; i++) {
			if(max>=m[i][0]) {				
				ar=new ArrayList<Integer>();
				ar.add(m[i][0]);
				ar.add(m[i][1]);
				list.add(ar);
			}
		}
		
		// N * K
		while (!pq.isEmpty()) {
			int size=pq.poll();
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).get(0)<=size) {
					sum+=list.get(i).get(1);
					list.remove(i);
					break;
				}
			}
			if(list.isEmpty()) break;
		}
		System.out.println(sum);
	}

}
