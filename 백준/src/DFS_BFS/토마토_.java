package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 토마토_ {
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	
	static int n,m,cnt=0;
	static ArrayList<Integer> arr1=new ArrayList<>();
	static ArrayList<Integer> arr2=new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str=null;
		str=new StringTokenizer(br.readLine(), " ");
		n=Integer.parseInt(str.nextToken());
		m=Integer.parseInt(str.nextToken());
		
		for (int i = 1; i <= m; i++) {
			str=new StringTokenizer(br.readLine()," ");
			for (int j = 1; j <= n; j++) {
				line[j][i]=Integer.parseInt(str.nextToken());
			}
		}
		
		for (int i = 0; i < n*m; i++) {
			arr1.clear();
			arr2.clear();
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= m; k++) {
					if(line[j][k]==1 && !ch[j][k]) {
						bfs(j,k);
					}
				}
			}
			
			for (int j = 0; j < arr1.size(); j++) {
				line[arr1.get(j)][arr2.get(j)]=1;
			}
			
			boolean iszero=true;
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= m; k++) {
					if(line[j][k]==0) {
						iszero=false;
					}
				}
			}
			if(iszero) {
				break;
			}else {
				
			}
			cnt++;
		}
		
		if(cnt==0) {
			System.out.println("0");
		}else {
			if(cnt==n*m) {
				System.out.println("-1");
			}else {
				System.out.println(cnt+1);
			}
		}
	}
	
	static void bfs(int x, int y) {
		ch[x][y]=true;
		for (int i = 0; i < 4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=1 && ny>=1 && nx<=n && ny<=m) {
				if(line[nx][ny]==0 && !ch[nx][ny]) {
					line[nx][ny]=2;
					arr1.add(nx);
					arr2.add(ny);
				}
			}
		}
	}
}
