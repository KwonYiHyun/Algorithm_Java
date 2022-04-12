package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 단지번호붙이기 {
	
	static int c;
	static boolean ch[][]=new boolean[1001][1001];
	static int house[][]=new int[1001][1001];
	static int ct=0;
	static int cnt=0;
	static ArrayList<Integer> arr=new ArrayList<>();
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		c=scan.nextInt();
		
		for (int i = 1; i <= c; i++) {
			String input=scan.next();
			for (int j = 1; j <= c; j++) {
				house[i][j]=input.charAt(j-1)-'0';
			}
		}
		
		for (int i = 1; i <= c; i++) {
			for (int j = 1; j <= c; j++) {
				if(house[i][j]==1 && !ch[i][j]) {
					cnt++;
					ct=0;
					dfs(i,j);
					arr.add(ct);
				}
			}
		}
		
		if(cnt==0) {
			System.out.println("0");
		}else {
			System.out.println(cnt);
			Collections.sort(arr);
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}
	}
	
	public static void dfs(int x, int y) {
		ct++;
		ch[x][y]=true;
		for (int i = 0; i < 4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=1 && ny>=1 && nx<=c && ny<=c){
				if(house[nx][ny]==1 && !ch[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
