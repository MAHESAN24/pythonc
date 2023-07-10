package busResv;

import java.util.*;
import java.util.ArrayList;

public class BusDemo {
	public static void main(String[] args) {
//		Bus buses[] = new Bus[50];//Arraylist - collection
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int useropt = 1;
		Scanner scan = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusinfo();
		}
		
		while(useropt == 1) {
			System.out.println("enter 1 to book 2 to exit");
			useropt = scan.nextInt();
			if(useropt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("tour booking is confirmed");
				}
				else {
					System.out.println("sorry :( try another bus");
				}
			}
			else {
				System.out.println("tnx for visting see u again :)");
			}
		}
	}
}
