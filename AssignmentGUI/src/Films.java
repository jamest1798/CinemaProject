import java.util.Scanner;

public class Films{
	
	public static void main(String[] args) {
	

	String film;	
	String filmChoice;
	int ticketPrice;
	int noTickets;    
    int theatreNo;
    
    
    
        	Scanner scanner1 = new Scanner( System.in );    		
			
    		System.out.print("Please select a film below:");
    		film = scanner1.nextLine();
        }
    
    
    public Films (String filmChoice,String film, int ticketPrice, int seats, int theatreNo){
    	
    	if (film.equals("HSR")){
    		filmChoice="HSR";    		    		
    	                        }
    	if (film.equals("JW2")){
    		ticketPrice=7;
    		seats=80;
    		theatreNo=9;
    	                        }
    	if (film.equals("LGN")){
    		ticketPrice=9;
    		seats=90;
    		theatreNo=8;
    	                        }
    	if (film.equals("TNG")){
    		ticketPrice=5;
    		seats=65;
    		theatreNo=7;
    	                        }
    	if (film.equals("PASSG")){
    		ticketPrice=6;
    		seats=45;
    		theatreNo=6;
    	                          }
    	if (film.equals("TGW")){
    		ticketPrice=4;
    		seats=55;
    		theatreNo=5;
    	                        }
        if (film.equals("JW2")){
        	ticketPrice=7;
        	seats=80;
        	theatreNo=4;
        	                    }
    	if (film.equals("JW2")){
        	ticketPrice=7;
        	seats=80;
        	theatreNo=3;
        	                    }
    	if (film.equals("JW2")){
        	ticketPrice=7;
        	seats=80;
        	theatreNo=2;
                                }
    	if (film.equals("JW2")){
        	ticketPrice=7;
        	seats=80;
        	theatreNo=1;
                             	}	   	
    }
	
		public void tickets(){
			
		
		//System.out.println("Film is: " + filmChoice + ticketPrice + seats + theatreNo);
		}
}
	
    
  

