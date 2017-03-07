
public class tickets extends Films {
	
	int ticketPrice;
	int noTickets;
	int seats;
	int seatsLeft; 

	public tickets(String film, String filmChoice, int ticketPrice, int seats, int theatreNo) {
		super(filmChoice, film, ticketPrice, seats, theatreNo);
		
		if (filmChoice.equals("HSR")){
		ticketPrice=9;
		seats=80;
		theatreNo=10;
	}
System.out.println("Film is: " + filmChoice + ticketPrice + seats + theatreNo);
}
}
