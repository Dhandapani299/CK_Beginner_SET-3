
import java.io.*;
import java.util.Scanner;
public class Validate{
public static void main(String args[]){

try (Scanner scanner = new Scanner(System.in)) {
    System.out.println(" input :Enter an integer : ");
    if (scanner.hasNextDouble()) {
        System.out.println("output :yes");
    } else {
        System.out.println("output : no");
    }
}
}
}
