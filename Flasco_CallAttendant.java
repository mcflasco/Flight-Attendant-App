package week01;

//Name: Michael Flasco
//Date: 01/13/2019
//Program Name: Call Attendant
//Purpose: Simulation using call button for call attendant

import java.util.Scanner;

public class Flasco_CallAttendant {

	static Scanner input;
	static Flasco_Attendant attendant;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);

		boolean run = true;

		attendant = new Flasco_Attendant();

		while (run) {

			System.out.println("1. Seat Buttons ");
			System.out.println("2. Attendent Buttons ");
			System.out.println("3. Show Seats ");
			System.out.println("4. Exit");
			String menu = input.nextLine();

			switch (menu) {

			case "1":
				chooseSeat();
				break;

			case "2":
				attendantCall();
				break;

			case "3":
				showSeats();
				break;

			case "4":
				run = false;
				System.out.println("Goodbye...");
			}

		}
		input.close();
	}

	public static void showSeats() {
		for (Flasco_Seats seats : attendant.seats)
			if (attendant.attendants.isEmpty()) {
				System.out.println(seats);
			}

		for (int i = 0; i < attendant.attendants.size(); i++) {
			System.out.println(attendant.attendants.get(i));
		}

	}

	public static void chooseSeat() {
		System.out.println("Enter a seat Number (1, 2, 3, 4, 5)");
		String num = input.nextLine();
		System.out.println("Would you like to call an Attendant (y/n)");
		String button = input.nextLine();
		System.out.println("Seat " + num + ": light has been turned on.");
		for (int i = 0; i < attendant.seats.size(); i++) {
			if (attendant.seats.get(i).seatNum.equals(num)) {
//				System.out.println(attendant.seats.get(i));
				if (button.equals("y")) {
					attendant.attendants.add(new Flasco_Attendant(num, "On"));

				}
			}
		}
	}

	public static void attendantCall() {

		for (int i = 0; i < attendant.attendants.size(); i++) {
			System.out.println(attendant.attendants.get(i));
		}
		System.out.println("Enter seat number to turn off.");
		String seatNum = input.nextLine();
		for (int i = 0; i < attendant.attendants.size(); i++) {
			if (attendant.attendants.get(i).seatNum.equals(seatNum))
				attendant.attendants.remove(i);
		}
		System.out.println("Seat " + seatNum + ": light has been turned off");

	}

}
