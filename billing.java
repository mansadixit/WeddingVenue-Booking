import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.InputMismatchException;

class billing{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int[] arr = new int[]{ 48232, 10000, 4356, 18000 };
    String [] str = new String[] {"Palace Garden", "Raj Mahal", "RP Halls", "CC Palace" };
    System.out.println("Enter your choice of venue: ");
    int ch=s.nextInt();
    System.out.println("What date do you want the venue: ");
    String dt=s.next();
    System.out.println("How many hours do you want to book the venue for: ");
    int hr=s.nextInt();
    System.out.println("--------BILL--------");
    int tp = arr[ch-1]*hr/2; //as in the file hours are taken as 2 by default
    System.out.println("Billing id: "+"VB"+tp);
    System.out.println("Total Cost: "+tp);
    System.out.println("Billing id: "+"VB"+tp);
    System.out.println("Venue: "+str[ch-1]);
    System.out.println("Date: "+dt);
    System.out.println("Hours: "+hr);
}
}