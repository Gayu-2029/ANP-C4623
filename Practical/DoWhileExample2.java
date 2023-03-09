package corejava;

import java.util.Scanner;

public class DoWhileExample2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
        } 
        while (num < 2);
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) 
        {
            if (num % i == 0) 
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println("Prime");
        } 
        else 
        {
            System.out.println("Not prime");
        }
    }
}


