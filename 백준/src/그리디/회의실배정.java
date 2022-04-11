package 그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class 회의실배정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int m[][]=new int[n][2];
		
		for (int i = 0; i < n; i++) {
			m[i][0]=scan.nextInt();
			m[i][1]=scan.nextInt();
		}
		
		Arrays.sort(m, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				
				return o1[1]-o2[1];
			}
		});
		
		int h=0, cnt=0;
		for (int i = 0; i < m.length; i++) {
			if(h<=m[i][0]) {
				h=m[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}