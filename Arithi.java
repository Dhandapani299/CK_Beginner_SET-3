import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
public class Arithi
	{
	public static void main(String args[])
		{
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the  number");
		 double AP ;
		 int a=  s.nextInt();
		 int n= s.nextInt();
		 int d= s.nextInt();
		 AP=a+(n-1)*d;

		 System.out.println("ANSWER" +AP);
		}
	}