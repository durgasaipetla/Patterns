package com.kodnest.patterns.practise;

public class Pattern23AlphabetI {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=3;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++) 
			{
				if(i==1||k==3||i==5) 
				{
				System.out.print("*");
			    }
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
