package week01;

//Name: Michael Flasco
//Date: 01/13/2019
//Program Name: Call Attendant
//Purpose: Simulation using call button for call attendant

import java.util.ArrayList;

public class Flasco_Attendant {

	public ArrayList<Flasco_Seats> seats = new ArrayList<>();

	public ArrayList<Flasco_Attendant> attendants = new ArrayList<>();

	public Flasco_Attendant() {

		seats.add(new Flasco_Seats("1", "Off"));
		seats.add(new Flasco_Seats("2", "Off"));
		seats.add(new Flasco_Seats("3", "Off"));
		seats.add(new Flasco_Seats("4", "Off"));
		seats.add(new Flasco_Seats("5", "Off"));

	}

	String seatNum;
	String button;

	public Flasco_Attendant(String seatNum, String button) {
		this.seatNum = seatNum;
		this.button = button;
	}

	public String toString() {
		return "Seat " + seatNum + ": light is " + button;
	}

}
