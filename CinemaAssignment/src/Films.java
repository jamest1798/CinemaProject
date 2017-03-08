import java.util.Random;

public class Films{
	
	static Random rand = new Random();

	static int  theatreNumber = rand.nextInt(10) + 1;
	
	
	static int JW2 = 8;		 //John Wick 2 ticket price
	public void setJW2(int x){
		this.JW2 = x;		
	}
	public int JW2Film(){
		return JW2;
	}	
	static int JW2Seats = 80; //John Wick 2 seat limit
	public void setJW2Seats(int x){
		this.JW2Seats = x;		
	}
	public int JW2Seats(){
		return JW2Seats;
	}
	static int Fury = 3;		
	public void setFury(int x){
		this.Fury = x;
	}
	public int getFury(){
		return Fury;
	}
	static int FurySeats = 55;
	public void setFurySeats(int x){
		this.FurySeats = x;		
	}
	public int FurySeats(){
		return FurySeats;
	}
	static int Hacksaw = 7;		
	public void setHacksaw(int x){
		this.Hacksaw = x;
	}
	public int getHacksaw(){
		return Hacksaw;
	}
	static int HackSeats = 75;
	public void setHackSeats(int x){
		this.HackSeats = x;		
	}
	public int HackSeats(){
		return HackSeats;
	}
	static int Goodf = 4;		
	public void setGoodf(int x){
		this.Goodf = x;
	}
	public int getGoodf(){
		return Goodf;
	}
	static int goodSeats = 35;
	public void setgoodSeats(int x){
		this.HackSeats = x;		
	}
	public int goodSeats(){
		return goodSeats;
	}
}

