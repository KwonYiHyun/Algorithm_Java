package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 안전영역 {
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	static int n;
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	static int save[][]=new int[1001][1001];
	
	static int cnt=0;
	static int max=0;
	
	static ArrayList<Integer> arr=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int a=scan.nextInt();
				line[i][j]=a;
				if(max<a) max=a;
			}
		}
		
		for (int i = 1; i <= max; i++) {
			ch=new boolean[1001][1001];
			cnt=0;
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if(line[j][k]<i) {
						save[j][k]=0;
					}else {
						save[j][k]=1;
					}
				}
			}
			
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if(save[j][k]==1 && !ch[j][k]) {
						cnt++;
						dfs(j,k);
					}
				}
			}
			arr.add(cnt);
		}
		Collections.sort(arr);
		
		
		System.out.println(arr.get(arr.size()-1));
	}
	
	static void dfs(int x, int y) {
		ch[x][y]=true;
		for (int i = 0; i < 4; i++) {
			int nx=dx[i]+x;
			int ny=dy[i]+y;
			if(nx>=1 && ny>=1 && nx<=n && ny<=n) {
				if(save[nx][ny]==1 && !ch[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
