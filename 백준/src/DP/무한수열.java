package DP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 무한수열 {
	
	static long d[]=new long[10000000];
	static Map<Long, Long> map=new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long N,P,Q;
		Scanner scan=new Scanner(System.in);
		N=scan.nextLong();
		P=scan.nextLong();
		Q=scan.nextLong();
		
		long a=1, b=0;
		map.put(b, a);
		
		System.out.println(pi(N, P, Q));
	}
	
	static long pi(long p, long P, long Q) {
		if(p==0) return 1;
		if(map.containsKey(p)) return map.get(p);
		map.put(p, pi(p/P, P, Q)+pi(p/Q, P, Q));
		return map.get(p);
	}

}
