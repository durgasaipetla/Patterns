package com.kodnest.patterns.practise;

public class Pattern21AlphabetS {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) 
	{
		for(int j=1;j<=3;j++) 
		{
			System.out.print(" ");
		}
		for(int k=1;k<=5;k++) 
		{
			if(i==1||i==3|k==1) 
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
	
	
	
	for(int i=1;i<=2;i++) 
	{
		for(int j=1;j<=3;j++) 
		{
			System.out.print(" ");
		}
		for(int k=1;k<=5;k++) 
		{
			if(i==2||k==5) 
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
