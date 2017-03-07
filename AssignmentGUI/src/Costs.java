
public class Costs extends tickets {

	int totalTicketCost;
	int snackCost;
	int totalCost;
	int snacks;
	int totalSnacks;
	int total;
	
	
	public Costs(String film, String filmChoice, int ticketPrice, int seats, int theatreNo) {
		super(film, filmChoice, ticketPrice, seats, theatreNo);
		
	}
	public void cost() {
		
	totalTicketCost=(ticketPrice*seats);
	
	totalSnacks=(snacks*snackCost);
	
	total=(totalSnacks*totalSnacks);
	
	System.out.println("total is: " + total);
	
	}
}
