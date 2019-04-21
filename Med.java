import java.io.*;
import java.util.Scanner;
public class Med
{
public static void main (String[] args)
{
Scanner input = new Scanner (System.in);
System.out.println("enter the quantity");
int num = input.nextInt();
double inputList[] = new double[num];
System.out.println("enter the " + num + " numbers below");
for (int i = 0 ; i < inputList.length; i++ )
{
inputList[i] = input.nextInt();
}
System.out.println("these are inputs");
sort(inputList);
print(inputList);
findMedian(inputList);
}
private static void sort (double[] inputList)
{
for (int i = 0; i < inputList.length; i++)
{
for (int j = i + 1; j < inputList.length; j++)
if (inputList[i] > inputList[j])
{
double temp = inputList[i];
inputList[i] = inputList[j];
inputList[j] = temp;
}
}
}
private static void print (double[] inputList)
{
for (int i = 0; i < inputList.length; i++)
System.out.printf("%-10s%-4s%-4s\n", i + 1 , " ", inputList[i]);
}
private static void findMedian (double[] inputList)
{
int middle = inputList.length / 2;
if (inputList.length%2 == 1)
{
System.out.println("The median is " + inputList[middle]);
} 
else 
{
System.out.println("The median is " + (inputList[middle-1] + inputList[middle]) / 2.0);
}
}
}