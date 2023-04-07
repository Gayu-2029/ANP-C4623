package Operatorssss;

import java.util.Scanner;

public class ComparisonOperator1 
{
	public static void main(String[] args) 
	{
	Scanner sc1=new Scanner(System.in);
	System.out.print("Enter the first string:");
	String s1=sc1.next();
	System.out.println("Enter the Second String:");
	String s2=sc1.next();
	//Strings are equal
	if(s1.equals(s2))
	{
		System.out.println("Equal");
	}
	else
	{
		System.out.println("Not Equal");
	}
}
}