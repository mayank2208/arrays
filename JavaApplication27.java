
package javaapplication27;

import java.lang.*;
import java.util.*;

class JavaApplication27
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		Random r = new Random();

		for(int i=0;i<arr.length;i++)		//length is a property
		{
			arr[i] = r.nextInt(100);
		}

		System.out.println("The Elements are : ");

		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%d : %d\n",i+1,arr[i]);
		}
	}
}


