package com.kodnest.patterns.practise;

public class Pattern10HollowSquare {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) 
	{
	 for(int j=1;j<=7;j++) 
	 {
		 if(i==1||j==1||i==6||j==7) 
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
