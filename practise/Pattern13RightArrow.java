package com.kodnest.patterns.practise;

public class Pattern13RightArrow {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) 
	{
		for(int j=0;j<=i;j++) 
		{
			System.out.print(" ");
		}
		for(int k=1;k<=1;k++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1;i<=8;i++) 
	{
		System.out.print("*");
	}
	System.out.println();
	
	
	
	for(int i=6;i>=1;i--) 
	{
		for(int j=1;j<=i;j++) 
		{
			System.out.print(" ");
		}
		for(int k=1;k<=1;k++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
