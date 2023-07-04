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

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	
	public static void main (String[] args)  {

	Scanner sc = new Scanner (System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
	try {
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in data (dd/MM/YYYY)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-in data (dd/MM/YYYY)");
		Date checkOut = sdf.parse(sc.next());
	    
		
	    Reservation reservation = new Reservation(number, checkIn, checkOut);
	    System.out.println("Reservation: "+ reservation);
	    
		System.out.println();
		System.out.println("Enter data to update the reservation");
		System.out.print("Check-in data (dd/MM/YYYY)");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-in data (dd/MM/YYYY)");
		checkOut = sdf.parse(sc.next());
		
		reservation.updateDates(checkIn, checkOut);
	    System.out.println("Reservatio: " + reservation);
        }     
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage() );
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
	
	sc.close();
	
	}	
}