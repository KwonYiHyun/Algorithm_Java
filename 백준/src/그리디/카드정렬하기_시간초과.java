package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드정렬하기_시간초과 {
	
	static ArrayList<Integer> arr=new ArrayList<>();
	static Queue<Integer> q=new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		Collections.sort(arr);
		
		int sum=0;
		while (!arr.isEmpty()) {
			if(arr.size()==1) {
				sum+=arr.get(0);
				arr.remove(0);
			}else if(arr.size()==2) {
				sum+=arr.get(0);
				sum+=arr.get(1);
				arr.remove(0);
				arr.remove(0);
			}else {
				sum+=arr.get(0);
				sum+=arr.get(1);
				int s=arr.get(0)+arr.get(1);
				arr.remove(0);
				arr.remove(0);
				arr.add(s);
			}
			
			Collections.sort(arr);
		}
		
		System.out.println(sum);
	}

}
