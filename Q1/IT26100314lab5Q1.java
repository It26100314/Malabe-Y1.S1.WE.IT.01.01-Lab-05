import java.util.Scanner;

public class IT26100314Lab5Q1 {
	
  public static void main(String[] args) {
	  
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Enter the first 1num: ");
   double num1 = scanner.nextInt();
   
   System.out.print("Enter the second 2num: ");
   double num2 = scanner.nextInt();
   
   System.out.print("Enter the third 3num: ");
   double num3 = scanner.nextInt();
   
   // Calculate the smallest and largest numbers
   double smallest = Math.min(num1, Math.min(num2, num3)); 
   double largest = Math.max(num1, Math.max(num2, num3));
   
   // Display the results with the exact expected formatting
   System.out.println("\\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
   System.out.println("The Smallest number is: " + smallest);
   System.out.println("The Largest number is: " + largest);
   
   scanner.close();
   
   }
 }  