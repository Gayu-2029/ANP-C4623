package corejava;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args)
	{
			//Creating a scanner class to take input from user
					Scanner sc = new Scanner(System.in);
					System.out.println("Which table you want to print?");
					//Creating a variable using scanner class object
					int n=sc.nextInt();
					for(int i=1;i<=10;i++)
					{
						System.out.println(n+" * "+i+" = "+n*i);
					}
					sc.close();
	}
					
}



