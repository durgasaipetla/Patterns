package com.kodnest.patterns.practise;

public class Pattern24SAI {
public static void main(String[] args) {
	/////PATTERN (S)
	
	
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

	///////////PATTERN (A)
	
	for(int i=1;i<=4;i++) 
	{
		for(int j=5;j>=i;j--) 
		{
			System.out.print(" ");
		}
		
		for (int k = 1; k <= (2 * i - 1); k++) 
		{
			if (k==1||k==(2*i- 1)) 
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
	
         ///////////PATTERN (I)
	System.out.println();
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
