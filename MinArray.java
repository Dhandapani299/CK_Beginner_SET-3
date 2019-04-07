import java.io.*;
import java.util.*;
public class MinArray
	{
	public static void main(String args[])
		{
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the  number of element in array");
		 int n= s.nextInt();
		 int min; 
		 int a[] = new int[n];
		  System.out.println("Enter the  element of array ");
		for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		}
		 min=a[0];
		for(int i=1;i<n;++i){
		if(min>a[i])
		{
		min=a[i];
		}
		}
		 System.out.println("maximum value :" +min);
		}
	}