//Sort an array and insert an element inside it
//Should print the sorted array. Also should print the new array values after insertion of element.

package com.session3.ass4SortAnArray;

import java.util.Arrays;

public class SortAnArray {
public static void main(String[] arg)
{
	int [] numArray = new int[10];
	
	for (int i=0;i<numArray.length;i++)
		{
			numArray[i]= (int)(Math.random()*100) +1;
			System.out.print(numArray[i]+" ");
		}
	System.out.println();
	
	//sort this array
	Arrays.sort(numArray);
	System.out.println("Sorted array is ");
	for (int i=0;i<numArray.length;i++)
	{
		System.out.print(numArray[i]+" ");
	}
	System.out.println();
	
	// insert an element to this sorted array
	int temp=10;
	//find the place to insert
	int i=0;
	while (i<numArray.length && temp>=numArray[i])
	{
		i++;
	}
	
	int j=i;
	int array2[]= new int[numArray.length +1];
	for (int m=0;m<j;m++)
	{
		array2[m]=numArray[m];
	}
	array2[j]=temp; //insert the new element
	
	//copy the remaining elements to the new array
	while(j+1<array2.length)
	{
		array2[j+1]=numArray[j];
		j++;
	}
	
	System.out.println("Sorted array after inserting 10 is:");
	for (int k=0;k<array2.length;k++)
	{
		System.out.print(array2[k]+" ");
	}
}
}
