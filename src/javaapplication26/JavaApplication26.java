
package javaapplication26;
import java.lang.*;
import java.util.Scanner;


public class JavaApplication26
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int size;
		System.out.print("Enter size of the array : ");
		size = s.nextInt();
		int arr[] = new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.printf("Enter Element %d : ",i+1);
			arr[i] = s.nextInt();
		}

		System.out.println("The Elements are : ");

		for(int i=0;i<size;i++)
		{
			System.out.printf("%d : %d\n",i+1,arr[i]);
		}
	}
}



    

