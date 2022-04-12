package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n;
		n=scan.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		Collections.sort(arr);
		
		for (int val : arr) {
			sb.append(val).append("\n");
		}
		
		System.out.println(sb);
	}

}
