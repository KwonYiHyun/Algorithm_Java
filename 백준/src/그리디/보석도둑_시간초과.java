package 그리디;

import java.util.*;

public class 보석도둑_시간초과 {
	
	static PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n,k;
		int sum=0;
		n=scan.nextInt();
		k=scan.nextInt();
		int m[][]=new int[n][2];
		boolean sp[]=new boolean[n];

		for (int i = 0; i < n; i++) {
			m[i][0]=scan.nextInt();
			m[i][1]=scan.nextInt();
		}
		for (int i = 0; i < k; i++) {
			pq.add(scan.nextInt());
		}
		
		Arrays.sort(m, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o2[0]-o1[0];
				}
				return o2[1]-o1[1];
			}
		});
		
		while (!pq.isEmpty()) {
			int size=pq.poll();
			for (int i = 0; i < sp.length; i++) {
				if(!sp[i] && m[i][0]<=size) {
					sp[i]=true;
					sum+=m[i][1];
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
