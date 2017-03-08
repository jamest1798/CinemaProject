import java.util.Scanner;
import java.lang.String;
public class Cinema extends Films{

	public static void main(String[] args) {
		
		String film;
		String numberTickets;
		String receipt;
		int filmCost = 0;
		int seats = 0;
		int theatreNo=0;
		Scanner scanner1 = new Scanner( System.in );
		
			
		System.out.print("Please select a film below: \n"
				+ "To select a film, please enter the code next to it"
				+ "\n"
				+ "\nFury CODE - F"
				+ "\nGoodfellas CODE - GF"
				+ "\nHacksaw Ridge CODE - HSR"
				+ "\nJohn Wick 2 CODE - JW2"
				+ "\n");
		
		film = scanner1.nextLine();
		
		if (film.equals("JW2")){     //If statements for user input
			filmCost=JW2;
			seats=JW2Seats;
			theatreNo=theatreNumber;
		}			
		else if (film.equals("F")){
				filmCost=Fury;
				seats=FurySeats;
				theatreNo=theatreNumber;
		}			
				else if (film.equals("HSR")){
				filmCost=Hacksaw;
				seats=HackSeats;
				theatreNo=theatreNumber;
		}			
		else if (film.equals("GF")){
				filmCost=Goodf;
				seats=goodSeats;
				theatreNo=theatreNumber;
		}
		else{
		    System.out.println("Sorry, we don't recognise this input, please try again."); //if the user enters a film not recognised
			System.exit(0);
		    }
		System.out.print("Ticket price: £" + filmCost + "\n" + "The number of seats available " + seats + "\n" + "Theatre: " + theatreNumber);  //Shows user film selected and price.
		
		System.out.print("\n");
		
		System.out.print("How many tickets would you like?");  
		
		numberTickets = scanner1.nextLine();
		
		int noTickets = Integer.parseInt(numberTickets);
		
		if (noTickets>seats){
	    System.out.println("Sorry, you have entered more tickets that we have available.");
	    System.exit(0);
		}
		else				
        System.out.println("You have selected " + noTickets + " tickets");
		
		System.out.println("The total price for your tickets is £" + (noTickets * filmCost));
		
		System.out.println("Number of seats remaining: " + (seats - noTickets));
		
		System.out.println("Would you like a receipt? ");
		receipt = scanner1.nextLine();
		 if (receipt.equals("Yes")){
		     receipt.equals("yes");
		 
		 System.out.println("Your Receipt \n"
		 		+ "Film: " + film + "\n"
		 		+ "Tickets: " + noTickets + "\n"
		 		+ "Theatre: " + theatreNo + "\n"
		 		+ "Total: £" + (noTickets * filmCost));
	}
		 else 
			 System.out.println("Thank you for using our cinema booking system," + "\n"
		 + "Enjoy your film and have a nice day");			 
				
		} 	
				
		}
	

	
	
		
	
		
		
	
	
		



		
		
		

