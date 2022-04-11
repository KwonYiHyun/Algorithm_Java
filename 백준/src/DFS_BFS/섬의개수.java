package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class ¼¶ÀÇ°³¼ö {
	
	static boolean ch[][]=new boolean[1001][1001];
	static int sum[][]=new int[1001][1001];
	static ArrayList<Integer> arr=new ArrayList<>();
	
	static int w,h;
	static int cnt=0;
	static int dx[]= {-1,-1,1,1,0,0,1,-1};
	static int dy[]= {1,-1,1,-1,1,-1,0,0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while (true) {
			w=scan.nextInt();
			h=scan.nextInt();
			if(w==0 && h==0) break;
			cnt=0;
			ch=new boolean[1001][1001];
			sum=new int[1001][1001];
			
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					sum[j][i]=scan.nextInt();
				}
			}
			
			for (int i = 1; i <= w; i++) {
				for (int j = 1; j <= h; j++) {
					if(sum[i][j]==1 && !ch[i][j]) {
						cnt++;
						dfs(i,j);
					}
				}
			}
			
			arr.add(cnt);
		}
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	
	static void dfs(int x, int y) {
		ch[x][y]=true;
		for (int i = 0; i < 8; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=1 && ny>=1 && nx<=w && ny<=h) {
				if(sum[nx][ny]==1 && !ch[nx][ny]) {
					dfs(nx,ny);
				}
			}
			
		}
	}
}
