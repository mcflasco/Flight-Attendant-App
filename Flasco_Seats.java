package week01;

//Name: Michael Flasco
//Date: 01/13/2019
//Program Name: Call Attendant
//Purpose: Simulation using call button for call attendant

public class Flasco_Seats {

	public String seatNum;
	public String button;

	public Flasco_Seats(String seatNum, String button) {

		this.seatNum = seatNum;
		this.button = button;

	}

	public String toString() {
		return "Seat " + seatNum + ": light is " + button;
	}

}
