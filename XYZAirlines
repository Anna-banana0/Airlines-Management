import java.util.ArrayList;

public class XYZAirlines implements AirlineFeatues{

	ArrayList<AccountDetails> account = new ArrayList<AccountDetails>();
	
	private AccountDetails searchAccount(int PRN) {
		// TODO Auto-generated method stub
		for(AccountDetails acd : account) {
			if(acd.getPRN()==PRN)
				return acd;
		}
		return null;
	}


	@Override
	public String bookFlight(String name, String eAddress, String mobileNumber, String from, String to) {
		// TODO Auto-generated method stub
		int PRNs = 11111;
		AccountDetails acd = new AccountDetails(PRNs++,name,eAddress, mobileNumber);
		account.add(acd);
		return "Your flight has been booked, Your PRN number is "+acd.getPRN();
	}

	@Override
	public String cancelBooking(int PRN) throws InvalidAccountException {
		// TODO Auto-generated method stub
		AccountDetails ad = searchAccount(PRN);
		if(ad==null)
			throw new InvalidAccountException("Invalid PRN!");
		account.remove(ad);
		return "Your Booking has been canceled";
	}

	@Override
	public String editDetails(int PRN, String nu) throws InvalidAccountException {
		// TODO Auto-generated method stub
		AccountDetails ad = searchAccount(PRN);
		if(ad==null)
			throw new InvalidAccountException("Invalid PRN!");
		
				ad.setEmailAddress(nu);
		return "Your account details are PRN number:"+ad.getPRN()+" Name: "+ad.getName()+" EmailAddress: "+ad.getEmailAddress()+" Mobile Number: "+ad.getMobileNumber();	
	}
	public String editDetails2(int PRN, String nu) throws InvalidAccountException{
		// TODO Auto-generated method stub
		AccountDetails ad = searchAccount(PRN);
		if(ad==null)
			throw new InvalidAccountException("Invalid PRN!");
		
				ad.setMobileNumber(nu);
		return "Your account details are "+ad.getPRN()+" "+ad.getName()+" "+ad.getEmailAddress()+" "+ad.getMobileNumber();	
	}
	

	@Override
	public String flightStatus(int PRN) throws InvalidAccountException {
		// TODO Auto-generated method stub
		AccountDetails ad = searchAccount(PRN);
		if(ad==null)
			throw new InvalidAccountException("Invalid PRN!");
		if(ad.getStatus())
			return "There is no delay on your flight!";
		else
			return "Your flight has been delayed! Please check your email for the updated timings";
	}


	
}
