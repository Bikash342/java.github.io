package com.bikash.pack1.arrays;

public class Occurance {
	public static void main(String[] args) {
		int [] a = {2,3,7,8,9,6,1,9,5,3};
		for(int i = 0;i<a.length;i++) {
			int count = 0;
			for(int j = 0;j<a.length;j++) 
				if(a[i] == a[j])
					count++;
			System.out.println(a[i] +" = " +count);	
		}
	}
}
