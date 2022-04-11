package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 적록색약 {
	
	static boolean ch[][]=new boolean[1001][1001];
	static char rgb[][]=new char[1001][1001];
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	
	static int n, blue=0;
	static int cnt=0;
	
	static ArrayList<Integer> arr=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			String input=scan.next();
			for (int j = 1; j <= n; j++) {
				rgb[i][j]=input.charAt(j-1);
			}
		}
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(rgb[i][j]=='R' && !ch[i][j]) {					
					cnt++;
					dfs(i,j,'R');
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(rgb[i][j]=='G' && !ch[i][j]) {					
					cnt++;
					dfs(i,j,'G');
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(rgb[i][j]=='B' && !ch[i][j]) {					
					cnt++;
					blue++;
					dfs(i,j,'B');
				}
			}
		}
		
		arr.add(cnt);
		ch=new boolean[1001][1001];
		cnt=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(rgb[i][j]=='G') {
					rgb[i][j]='R';
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(rgb[i][j]=='R' && !ch[i][j]) {					
					cnt++;
					dfs(i,j,'R');
				}
			}
		}
		
		arr.add(cnt+blue);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
	}
	
	static void dfs(int x, int y, char c) {
		ch[x][y]=true;
		for (int i = 0; i < 4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=1 && ny>=1 && nx<=n && ny<=n) {
				if(rgb[nx][ny]==c && !ch[nx][ny]) {
					dfs(nx,ny,c);
				}
			}
		}
	}
}
