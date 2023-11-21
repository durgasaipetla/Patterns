package com.kodnest.patterns.practise;

public class Pattern8Alphabeticala {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) 
		{
			for(int j=4;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
			System.out.print("a ");	
			}
			System.out.println();
		}
	}

}
