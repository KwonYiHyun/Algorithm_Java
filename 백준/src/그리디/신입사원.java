package 그리디;

import java.util.*;
import java.io.*;

public class 신입사원 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int t;
		t=Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int count=1;
			int cnt;
			cnt=Integer.parseInt(br.readLine());
			int arr[][]=new int[cnt][2];
			
			for (int j = 0; j < cnt; j++) {
				StringTokenizer str=new StringTokenizer(br.readLine()," ");
				arr[j][0]=Integer.parseInt(str.nextToken());
				arr[j][1]=Integer.parseInt(str.nextToken());
			}
			
			Arrays.sort(arr, (o1, o2)->{
				if(o1[0]==o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}else {
					return Integer.compare(o1[0], o2[0]);
				}
			});
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j][0]+" / "+arr[j][1]);
			}
			
			
			int p=arr[0][1];
			for (int j = 1; j < cnt; j++) {
				if(p>arr[j][1]) {
					count++;
					p=arr[j][1];
				}
			}
			
			sb.append(count+"\n");
		}
		
		System.out.println(sb);
	}
}
