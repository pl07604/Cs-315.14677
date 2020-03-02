import java.util.Scanner;

public class CarleyEventPriceWithMethods {

	//public static void main(String[] args) {
		
		//int guests = numberOfGuests();
		//carlysMotto();
		//eventPrice(guests);
		
	//}	
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getEventNumber(){
		
		System.out.println("Enter event number: ");
		String eventNumber = scanner.nextLine();
		return eventNumber;
		
	}
	public static int getNumberOfGuets() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number Of Guets: ");
		int numberGuests =scanner.nextInt();
		// if number of guest entered is > 0 then proceed otherwise throw error
		// limited number of seates < 150 
		return numberGuests;
	}
	
	
	public static String eventPrice (int guests) {
		final int perGuestsCost =35;
		int totalPrice = perGuestsCost * guests;
		System.out.println("Total Price: " + totalPrice);
	
		if (guests >= 50) {
			return "It is large Event";
		}else {
			return "It is not large Event";
		}
		
		}
		
	public static void carlysMotto(Event event) {
		System.out.println("***********************************************");
		System.out.println("Carly's makes the food that makes it a party");
		System.out.println("***********************************************");
		System.out.println("Event Name: "+ event.getEventNumber());
		System.out.println("Number OF Guets Attend The Event: "+ event.getGuests());
		System.out.println("Price per Guets: $ "+ event.perGuestCost);
		System.out.println("Event Price: "+event.getPrice());
		//System.out.println("Cut off for large event is: "+event.largeEvent);
		// if guest number is more than 50 
		// if less than 50 then something else 
//		if (event.getGuests() > 50 ) {
//			System.out.println("It is large Event");
//		}else {
//			System.out.println ("It is not large Event");
//		}
		
		System.out.println(eventPrice(event.getGuests()));
	}
	
			
	}
	
	
	
