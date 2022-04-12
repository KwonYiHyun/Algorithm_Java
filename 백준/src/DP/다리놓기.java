package DP;

import java.util.Scanner;

public class 다리놓기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int n[]=new int[num];
		int m[]=new int[num];
		long result[]=new long[num];
		
		for (int i = 0; i < num; i++) {
			n[i]=scan.nextInt();
			m[i]=scan.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			long _n=1;
			long _m=1;
			
			long arr1[]=new long[n[i]];
			long arr2[]=new long[n[i]];
			
			for (int j = 0; j < n[i]; j++) {
				arr1[j]=m[i]-j;
				arr2[j]=(1+j);
			}
			
			for (int k = 0; k < n[i]; k++) {
				for (int l = 0; l < n[i]; l++) {
					if(arr1[k]%arr2[l]==0) {
						arr1[k]/=arr2[l];
						arr2[l]/=arr2[l];
					}
				}
			}
			
			for (int k = 0; k < arr1.length; k++) {
				_n*=arr1[k];
			}
			
			for (int k = 0; k < arr2.length; k++) {
				_m*=arr2[k];
			}
			
			result[i]=(long) (_n/_m);
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}

