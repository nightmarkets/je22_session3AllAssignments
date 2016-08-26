/*
 * Write a simple Java program to check whether a given number is a prime number or not.
 */
package com.session3.ass2PrimeNumber2;

import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[] arg)
{
	int isPrime;
	System.out.println("Please enter a number:");
	Scanner in=new Scanner(System.in);
	isPrime=in.nextInt();
	int i=5;
	
	if (isPrime<1 || isPrime==4)
		System.out.println("Not a prime number");
	else if (isPrime<=3)
		System.out.println("It is a prime number");
	else
		{
		for (;i<= Math.sqrt(isPrime);i++)
			{
				if ((isPrime%i == 0) || (isPrime%(i+2)==0))
				{
					System.out.println("Not a prime number");
					break;
				}
			}
		}
	if ( i > (int)Math.sqrt(isPrime))
		System.out.println("It is a prime number");
}
}
