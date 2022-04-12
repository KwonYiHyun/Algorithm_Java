package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _30 {
	
	static ArrayList<Integer> arr=new ArrayList<>();
	static int sum=0;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String m;
		m=scan.nextLine();
		for (int i = 0; i < m.length(); i++) {
			arr.add(Integer.parseInt(m.substring(i,i+1)));
			sum+=arr.get(i);
		}
		
		Collections.sort(arr, Comparator.reverseOrder());
		
		if(sum%3==0 && arr.get(arr.size()-1)==0) {
			String n="";
			for (int i = 0; i < arr.size(); i++) {
				n+=arr.get(i);
			}
			System.out.println(n);
		}else {
			System.out.println("-1");
		}
	}

}
