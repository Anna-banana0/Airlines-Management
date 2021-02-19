import java.util.*;

public class Airlines {
	private static Scanner sc = new Scanner(System.in);
	private static AirlineFeatues airlineserver = ObjectFactory.getAirlineInstance();
	public static void main(String[] args) throws InvalidAccountException{
		
	boolean choice = true;
	int x = 67930;
	while(choice)
	{
		System.out.println("Choose any one from below");
		System.out.println("Type 1: Book Fligh");
		System.out.println("Type 2: Cancel Fligh");
		System.out.println("Type 3: Edit Flight details");
		System.out.println("Type 4: Flight Status");
		System.out.println("Type 5: Exit");
		int opt = Integer.parseInt(sc.nextLine());
		switch(opt) {
		case 1:
				bookFlight();
				break;
		case 2:
				cancelFlight();
				break;
		case 3:
				editDetails();
				break;
		case 4:
				status();
				break;
		case 5:
				exit();
				break;
				
		}
	}

	}


	private static void bookFlight() {
		// TODO Auto-generated method stub
		System.out.println("Let us know your name");
		String name = sc.nextLine();
		System.out.println("Please provide your email address");
		String eaddress = sc.nextLine();
		//sc.nextLine();
		System.out.println("Your mobile number");
		String mobileNumber = sc.nextLine();
		//sc.nextLine();
		System.out.println("From city:");
		String from = sc.nextLine();
		//sc.nextLine();
		System.out.println("To city");
		String to = sc.nextLine();
		//sc.nextLine();
		String PRN = airlineserver.bookFlight(name, eaddress, mobileNumber, from, to);
		System.out.println(PRN);
		
	}

	private static void cancelFlight() throws InvalidAccountException {
		// TODO Auto-generated method stub
		System.out.println("Please enter your PRN number");
		int PRN = Integer.parseInt(sc.nextLine());
		String canceled = airlineserver.cancelBooking(PRN);
		System.out.println(canceled);
	}
	
	private static void editDetails() throws InvalidAccountException{
		// TODO Auto-generated method stub
		System.out.println("Please enter your PRN number");
		int PRN = Integer.parseInt(sc.nextLine());
		int opt = -1;
		System.out.println("Please select from below");
		System.out.println("1. Change email address");
		System.out.println("2. Change phone number");
		System.out.println("3. For other changes");
		opt = Integer.parseInt(sc.nextLine());
		switch(opt) {
		case 1:
			System.out.println("Enter your new email address");
			String nemail = sc.nextLine();
			String edits = airlineserver.editDetails(PRN, nemail);
			System.out.println(edits);
			break;
		
		case 2:
			System.out.println("Enter your new phone number");
			String nPhNo = sc.nextLine();
			sc.nextLine();
			String edit = airlineserver.editDetails2(PRN, nPhNo);
			System.out.println(edit);
			break;
		
		case 3:
			System.out.println("Please contact Mr/Ms Abc");
			System.out.println("9834040932");
			break;
		
		default:
			System.out.println("Please choose the correct option");
			break;
		}
		
	}

	private static void status() throws InvalidAccountException {
		// TODO Auto-generated method stub
		System.out.println("Enter your PRN number");
		int PRN = Integer.parseInt(sc.nextLine());
		String stats = airlineserver.flightStatus(PRN);
		System.out.println(stats);
	}
	
	private static void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

}

