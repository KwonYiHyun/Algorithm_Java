package 트리;

import java.util.*;

public class 트리 {
	
//	static List<Integer> list=new ArrayList<Integer>();
	static int arr[];
	static int cnt=0,m,n;
	
	static boolean ch[]=new boolean[1001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		arr=new int[n];
		
		int root=0;
		for (int i = 0; i < n; i++) {
			int a=scan.nextInt();
			arr[i]=a;
			if(a==-1) root=i;
		}
		
		m=scan.nextInt();
		deleteNode(m);
		
		dfs(root);
		System.out.println(cnt);
	}
	
	static void deleteNode(int i) {
		arr[i]=-2;
		for (int j = 0; j < n; j++) {
			if(arr[j]==i) {
				deleteNode(j);
			}
		}
	}
	
	static void dfs(int s) {
		boolean leaf=false;
		ch[s]=true;
		if(arr[s]!=-2) {
			for (int i = 0; i < n; i++) {
				if(arr[i]==s && !ch[i]) {
					leaf=true;
					dfs(i);
				}
			}
			if (!leaf) {
				cnt++;
			}
		}
	}
}
