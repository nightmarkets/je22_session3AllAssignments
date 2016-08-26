//Print reverse of an array

package com.session3.ass3ReverseArray;

import java.util.Scanner;

public class ReverseArray {
public static void main (String[] arg)
{

	int [] numArray = new int[10];
	for (int i=0; i<numArray.length;i++)
		numArray[i]=i;
	//start to print reverse of array
	for (int j=numArray.length; j>0;j--)
	{
		System.out.println(numArray[j-1]);
	}
}
}
