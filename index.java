import java.io.*;
import java.util.Scanner;
public class index {
 
 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
 
		
		System.out.print("Enter how many numbers: ");
		int numOfFriends = Integer.parseInt(scan.nextLine());
 
		//Create a string array to store the names of your friends
		String arrayOfNames[] = new String[numOfFriends];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print( "  ");
		        arrayOfNames[i] = scan.nextLine();
		}
		    
		
		for (int i = 0; i < arrayOfNames.length; i++) {
			
		        System.out.print(arrayOfNames[i] +" "+i + "\n" );
		}
		  
 
		    
 
	}
 
}
