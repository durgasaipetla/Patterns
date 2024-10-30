package com.kodnest.patterns.level4;

public class Pattern11Radware {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int l=(10-i*2);
			for(int k=1;k<=l;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
