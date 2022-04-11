package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class 듣도보도못한 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, M;
		Scanner scan=new Scanner(System.in);
		
		N=scan.nextInt();
		M=scan.nextInt();
		scan.nextLine();
		
		HashMap<String, String> map=new HashMap<>();
		HashMap<String, String> map2=new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String s=scan.nextLine();
			map.put(s, s);
		}
		
		for (int i = 0; i < M; i++) {
			String s=scan.nextLine();
			map2.put(s, s);
		}
		
		int ar[]= {1,2};
		List<Integer> list=new ArrayList<Integer>();
		
		
		HashMap<String, String> mp=new HashMap<>(map);
		mp.entrySet().retainAll(map2.entrySet());
		
		Object[] omp=mp.keySet().toArray();
		Arrays.sort(omp);
		System.out.println(mp.size());
		for (int i = 0; i < omp.length; i++) {
			System.out.println(omp[i]);
		}
	}

}
