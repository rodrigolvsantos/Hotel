 /* Check-out date (dd/MM/yyyy): 21/09/2019
 * Error in reservation: Check-out date must be after check-in date
 *
 * Errors
 * 
 * 
 * Room number: 8021
 * Check-in date (dd/MM/yyyy): 23/09/2019
 * Check-out date (dd/MM/yyyy): 26/09/2019
 * Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
 * 
 * Enter data to update the reservation:
 * Check-in date (dd/MM/yyyy): 24/09/2015
 * Check-out date (dd/MM/yyyy): 29/09/2015
 * Error in reservation: Reservation dates for update must be future dates
 * 
 * Room number: 8021
 * Check-in date (dd/MM/yyyy): 23/09/2019
 * Check-out date (dd/MM/yyyy): 26/09/2019
 * Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
 * 
 * Room number: 8021
 * Check-in date (dd/MM/yyyy): 23/09/2019
 * Check-out date (dd/MM/yyyy): 26/09/2019
 * Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights
 * 
*/

package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Reservation.java.Reservation;

public class Program {
	
	public static void main (String[] args) throws ParseException {

	Scanner sc = new Scanner (System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.print("Room Number: ");
	int number = sc.nextInt();
	System.out.print("Check-in data (dd/MM/YYYY)");
	Date checkIn = sdf.parse(sc.next());
	System.out.print("Check-in data (dd/MM/YYYY)");
	Date checkOut = sdf.parse(sc.next());
    
	if (!checkOut.after(checkIn)) {
		System.out.println("Eror in reservation: Check-out date must be after check-in date");
    }else {
    	Reservation reservation = new Reservation(number, checkIn, checkOut);
    	System.out.println("Reservation: "+ reservation);
    }
	
	Reservation reservation = new Reservation(null, checkIn, checkOut);
	System.out.println("Reservatio: " + reservation);
	
	System.out.println();
	System.out.println("Enter data to update the reservation");
	System.out.print("Check-in data (dd/MM/YYYY)");
	checkIn = sdf.parse(sc.next());
	System.out.print("Check-in data (dd/MM/YYYY)");
	checkOut = sdf.parse(sc.next());
	
	 String error = reservation.updateDates(checkIn, checkOut);
	 if (error!= null) {
		 System.out.println("Error in reservation " + error);
	 }else {
	 System.out.println("Reservatio: " + reservation);
	}
	
	
	sc.close();
	
}	
}