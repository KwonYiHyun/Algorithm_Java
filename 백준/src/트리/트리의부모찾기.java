package 트리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 트리의부모찾기 {
	
	static List<Integer>[] list;
	static boolean ch[]=new boolean[100001];
	static int n;
	static int par[]=new int[100001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		list=new ArrayList[n+1];
		
		for (int i = 0; i < n+1; i++) {
			list[i]=new ArrayList<>();
		}
		
		for (int i = 0; i < n-1; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		dfs(1);
		
		for (int i = 2; i <= n; i++) {
			System.out.println(par[i]);
		}
	}
	
	static void dfs(int i) {
		ch[i]=true;
		int r;
		for (int j = 0; j < list[i].size(); j++) {
			if(!ch[list[i].get(j)]) {
				par[list[i].get(j)]=i;
				dfs(list[i].get(j));
			}
		}
	}
}
