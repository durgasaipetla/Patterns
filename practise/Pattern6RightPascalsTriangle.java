package com.kodnest.patterns.practise;

public class Pattern6RightPascalsTriangle{
public static void main(String[] args) {
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=i;j++) 
		{
		System.out.print("* ");	
		}
		System.out.println();
	}
	for(int i=6;i>=1;i--) 
	{
		for(int j=1;j<=i;j++) 
		{
		System.out.print("* ");	
		}
		System.out.println();
	}
}
}
