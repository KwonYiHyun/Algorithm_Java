package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 보물 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		for (int i = 0; i < n; i++) {
			b.add(scan.nextInt());
		}
		
		Collections.sort(a);
		Collections.sort(b);
		
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum+=a.get(a.size()-i-1)*b.get(i);
		}
		
		System.out.println(sum);
	}

}
