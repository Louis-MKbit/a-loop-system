package loopsystem;


import java.util.Scanner;

public class louis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);
		        String data;

		        // This loop will run until the user enters a ten-lettered word
		        do {
		            System.out.print("Enter data (ten-lettered word to quit): ");
		            data = scanner.nextLine();
		            
		            if (data.length() < 10) {
		            
		                System.out.println("You entered: " + data);
		               
		            } else {
		                System.out.println("Exiting..........");
		                
		            }
		        } while (data.length() < 10);

		        
		        scanner.close();
		    }
		}

