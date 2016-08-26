/*
 * To  calculate  square  root and  cube  root  of  a  number  in  Java.
Use  Math  class  and  its  static method sqrt(...) & cbrt(...).
 */
package com.session3.ass1CalculateSq;

import java.util.Scanner;

public class CalculateSquare {
public static void main (String[] arg)
{
	double number;
	System.out.println("please enter an integer nubmer:");
	Scanner in = new Scanner(System.in);
	number = in.nextInt();
	System.out.println("Square root = "+ Math.sqrt(number));
	System.out.println("Cube root = " + Math.cbrt(number));
}
}
