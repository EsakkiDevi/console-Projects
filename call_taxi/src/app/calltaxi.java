package app;

import java.util.List;
import java.util.Scanner;

import dao.daotasks;
import model.pojo;
import model.pojo1;

public class calltaxi
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		daotasks d= new daotasks();


		while(true) {

		System.out.println("Call Taxi Booking");
		System.out.println("---- ---- -------");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Exit");

		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
		scanner.nextLine();

		switch(choice)
		{
		case 1:
			System.out.println("Enter your name:");
			String name=scanner.nextLine();
			System.out.println("Enter your Phone number:");
			String phn_no=scanner.nextLine();
			System.out.println("Enter the Password:");
			String password=scanner.nextLine();
			d.add_details(new pojo(name,phn_no,password));
			break;

		case 2:
			System.out.println("Enter your Phone Number:");
			phn_no=scanner.nextLine();
			System.out.println("Enter your Password:");
			password=scanner.nextLine();

			int id=d.loginCheck(new pojo(phn_no,password));
					if(id!=-1)
						{
							System.out.println("Login succesfully");

								while(true)
									{
									System.out.println("  Menu  ");
									System.out.println("1.Book a Taxi");
									System.out.println("2.Cancel a Taxi");
									System.out.println("3.View My Bookings");
									System.out.println("4.Logout");
									System.out.println("Choose the option");
									int option=scanner.nextInt();
									scanner.nextLine();

									switch(option)
									{
									case 1:
										System.out.println("Pick-up Location:");
										String pickup=scanner.nextLine();
										System.out.println("Drop Location:");
										String drop=scanner.nextLine();
										d.booking(new pojo1(id,pickup,drop));
										break;

									case 2:
										System.out.println("Enter the ride id to cancel :");
										int ride_id=scanner.nextInt();
										d.cancel(new pojo1(id,ride_id));
										break;

									case 3:
										List<pojo1> bookings=d.getAllBookings(id);
										if(bookings.isEmpty())
										{
											System.out.println("No..! Bookings found");

										}
										else
										{
											System.out.println("Your Booking List:");
											for(pojo1 booking:bookings)
											{
												System.out.println(booking);
											}
										}
										break;

									case 4:
										System.out.println("Logged Out.. gOod byee");
										return;

									default:
										System.out.println("Invalid option");



									}
									}
							}
					else
					{
						System.out.println("Login failed...");
					}

					break;

		case 3:
			System.out.println("Exitfrom Call taxi Booking");
			System.exit(0);

		default:
			System.out.println("invalid choice");

		}
		}


	}
}