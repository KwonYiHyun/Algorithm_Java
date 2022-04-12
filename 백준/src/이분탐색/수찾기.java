package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 수찾기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int n,m;
		n=Integer.parseInt(br.readLine());
		int s1[]=new int[n];
		StringTokenizer str=new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			s1[i]=Integer.parseInt(str.nextToken());
		}
		
		m=Integer.parseInt(br.readLine());
		int s2[]=new int[m];
		str=new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < m; i++) {
			s2[i]=Integer.parseInt(str.nextToken());
		}
		
		
		Arrays.sort(s1);
		
		for (int i = 0; i < s2.length; i++) {
			int start=0;
			int end=s1.length-1;
			
			int val=s2[i];
			int result=0;
			while (start<=end) {
				int mid=(start+end)/2;
				if(val>s1[mid]) {
					start=mid+1;
				}else if(val<s1[mid]){
					end=mid-1;
				}else {
					result=1;
					break;
				}
			}
			if(result==0) {
				sb.append("0\n");
			}else {
				sb.append("1\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
