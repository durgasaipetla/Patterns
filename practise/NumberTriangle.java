package com.kodnest.patterns.practise;

public class NumberTriangle {
public static void main(String[] args, int a) {
	for(int i=4;i>=1;i--) 
	{
		for(int j=1;j<=i;j++) 
		{
			System.out.print(" ");
		}
		for(int k=5;k>=i;k--)
			
		{
			System.out.print(a+" ");
			a++;
		}
		System.out.println("hi");
	}
}
}
