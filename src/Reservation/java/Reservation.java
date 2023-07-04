package Reservation.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkou;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkou) {
		 this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkou = checkou;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckou() {
		return checkou;
	}
	
	public long duration() {
		long diff = getCheckou().getTime() - checkIn.getTime(); /*Calcule the diference belgong 2 períods In ML Seconds*/
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkou = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room"
				+roomNumber
				+", check-in"
				+sdf.format(checkIn)
				+", check-out"
				+sdf.format(checkou)
				+", "
				+duration()
				+" night";
				}
				
	
}
