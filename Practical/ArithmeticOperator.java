package Operatorssss;

import java.util.Scanner;

public class ArithmeticOperator 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum:"+sum);
		int sub=num1-num2;
		System.out.println("Subraction:"+sub);
		int mul=num1*num2;
		System.out.println("Multiplication:"+mul);
		int div=num1/num2;
		System.out.println("Division:"+div);
		int mod=num1%num2;
		System.out.println("Modulus:"+mod);
		sc.close();
	}

}
