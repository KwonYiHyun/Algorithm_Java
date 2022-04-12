import java.util.Scanner;

public class 쉽게푸는문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		int arr[]=new int[1001];
		
		int cnt=1;
		int s=1;
		while (true) {
			for (int i = 1; i <= s; i++) {
				arr[cnt-1]=s;
				cnt++;
				if(cnt>1001) break;
			}
			s++;
			if(cnt>1001) break;
		}
		
		int sum=0;
		for (int i = n; i <= m; i++) {
			sum+=arr[i-1];
		}
		System.out.println(sum);
	}

}