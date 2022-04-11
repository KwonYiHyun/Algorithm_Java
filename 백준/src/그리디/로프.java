package 그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 로프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int max=0;
		ArrayList<Integer> arr=new ArrayList<>();
		int n;
		n=scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		Collections.sort(arr);
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i)*(n-i)>max) max=arr.get(i)*(n-i);
		}
		
		System.out.println(max);
	}

}
