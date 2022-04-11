package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 프린터큐 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ct=Integer.parseInt(br.readLine());
		for (int i = 0; i < ct; i++) {
			String s=br.readLine();
			int n=Integer.parseInt(s.split(" ")[0]);
			int m=Integer.parseInt(s.split(" ")[1]);
			int p[]=new int[n];
			StringTokenizer str=new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < p.length; j++) {
				p[j]=Integer.parseInt(str.nextToken());
			}
			
			
		}
	}

}
