package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 영역구하기 {
	
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	
	static int n,m,k;
	static ArrayList<Integer> arr=new ArrayList<>();
	static int cnt=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		k=scan.nextInt();
		
		for (int i = 0; i < k; i++) {
			int s[]=new int[4];
			s[0]=scan.nextInt();
			s[1]=scan.nextInt();
			s[2]=scan.nextInt();
			s[3]=scan.nextInt();
			for (int j = s[1]; j < s[3]; j++) {
				for (int l = s[0]; l < s[2]; l++) {
					line[j][l]=1;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(line[i][j]==0 && !ch[i][j]) {
					cnt=0;
					dfs(i,j);
					arr.add(cnt);
				}
			}
		}
		
		Collections.sort(arr);
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
	}
	
	static void dfs(int x, int y) {
		ch[x][y]=true;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0 && ny>=0 && nx<n && ny<m) {
				if(line[nx][ny]==0 && !ch[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
