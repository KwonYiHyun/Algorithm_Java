package 이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 나무자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n,m;
		n=scan.nextInt();
		m=scan.nextInt();
		int tree[]=new int[n];
		int max=0;
		for (int i = 0; i < tree.length; i++) {
			tree[i]=scan.nextInt();
			if(tree[i]>max) max=tree[i];
		}
		
		Arrays.sort(tree);
		
		int start=0;
		int end=max;
		int min=Integer.MAX_VALUE;
		while (true) {
			int mid=tree[(start+end)/2];
			int sum=0;
			for (int i = 0; i < tree.length; i++) {
				if(tree[i]>mid) sum+=(tree[i]-mid);
			}
			if(m<=sum) {
//				if(min>mid) min=mid;
//				end=mid-1;
				min=mid;
				break;
			}else {
				start=mid+1;
			}
		}
		System.out.println(min);
	}

}
