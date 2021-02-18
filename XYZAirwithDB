import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class XYZAirwithDB implements AirlineFeatues{

	private AirlineDB database = new AirlineDB();

	@Override
	public String bookFlight(String name, String eAddress, String mobileNumber, String from, String to) {
		// TODO Auto-generated method stub
		int PRNs = 1111;
		try {
			int i = database.getMaxAccNo();
			if(i != 0) 
				PRNs = i+1;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		database.addAccount(name, eAddress, mobileNumber, PRNs);
		return "Your flight has been booked, Your PRN number is "+PRNs;
	}

	@Override
	public String cancelBooking(int PRN) throws InvalidAccountException {
		// TODO Auto-generated method stub
		database.deleteAccount(PRN);
		return "Your Booking has been canceled";
	}

	@Override
	public String editDetails(int PRN, String nu) throws InvalidAccountException {
		// TODO Auto-generated method stub
		boolean check = database.updateEmail(PRN, nu);
		if(check)
		return "Thank you. changes have been made";
		else
			return "Invalid PRN";
		}
	public String editDetails2(int PRN, String nu) throws InvalidAccountException{
		// TODO Auto-generated method stub
		
		boolean check = database.updatePhone(PRN, nu);
		if(check)
		return "Thank you. Changes have been made!";
		else
			return "Invalid PRN";
		}
	

	@Override
	public String flightStatus(int PRN) throws InvalidAccountException {
		// TODO Auto-generated method stub

		 Random rd = new Random(); // creating Random object
	     if(rd.nextBoolean()) // displaying a random boolean
	    	 return "There is no delay on your flight!";
	     else
			return "Your flight has been delayed! Please check your email for the updated timings";
	}


	
}
