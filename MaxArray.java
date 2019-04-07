import java.io.*;
import java.util.*;
public class MaxArray
	{
	public static void main(String args[])
		{
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the  number of element in array");
		 int n= s.nextInt();
		 int max; 
		 int a[] = new int[n];
		  System.out.println("Enter the  element of array ");
		for(int i = 0;i<n;i++){
		a[i]=s.nextInt();
		}
		 max=a[0];
		for(int i=0;i<n;i++){
		if(max<a[i])
		{
		max = a[i];
		}
		}
		 System.out.println("maximum value :" +max);
		}
	}