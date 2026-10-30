import java.util.Scanner;

public class IT26100314Lab5Q2 {
	 public static void main(String[] args) {
		 
		  Scanner input = new Scanner(System.in);
		  
		  int count;
		  
		  System.out.print("Enter the number of new members introduced: ");
		  
		  count = input.nextInt();
		  
		  // Validate the input
          if (count < 0) {
			  
			  
		  System.out.println("Invalid number! Please enter a number greater than or equal to 0.");
          } else {
			  
			  
            switch (count) {
                case 0:
                    System.out.println("Prize: No Prize");
                    break;

                case 1:
                    System.out.println("Prize: Pen");
                    break;

                case 2:
                    System.out.println("Prize: Umbrella");
                    break;

                case 3:
                    System.out.println("Prize: Bag");
                    break;

                case 4:
                    System.out.println("Prize: Travelling Chair");
                    break;

		   
		 
                default:
                    System.out.println("Prize: Headphone");
                    break;
            }
        }

        input.close();
    }
}