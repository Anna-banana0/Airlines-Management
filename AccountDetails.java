import java.util.Random;

public class AccountDetails {
	private String name;
	private String emailAddress;
	private String mobileNumber;
	private int PRN;
	AccountDetails(int PRN, String name, String emailAddress, String mobileNumber)
	{
		this.name = name;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
		this.PRN = PRN;
	}
	
	public int getPRN() {
		return PRN;
	}

	public void setPRN(int pRN) {
		PRN = pRN;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean getStatus() {
	 Random rd = new Random(); // creating Random object
	     return rd.nextBoolean(); // displaying a random boolean
	}
	
}
