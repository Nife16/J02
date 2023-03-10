package phoneBook;

import java.util.Scanner;

public class Person {
	long id;
	String firstName;
	String lastName;
	Address address;
	long phoneNumber;
	String personalInfo = firstName + " " + lastName + " " + address.fullAddress + " " + phoneNumber;

	Person(String firstName, String lastName, Address address, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public static Person createPerson(Scanner scanner, Address address) {
		System.out.println("Please enter your personal information: ");
		System.out.println("Your first name (enter no name if not applicable): ");
		String firstName = scanner.nextLine();
		if (firstName.equals("no name")) {
			firstName = null;
		}
		System.out.println("Your last name: ");
		String lastName = scanner.nextLine();
		System.out.println("Your phone number (1234567890 format): ");
		long phoneNumber = scanner.nextLong();

		return new Person(firstName, lastName, address, phoneNumber);
	}

	public static void updatePerson(Scanner scanner, Person person) {

		if (person == null) {
			System.out.println("We didnt find ya son. Too bad.");
		} else {
			System.out.println("What would you like to update: ");
			System.out.println("1: Your first name");
			System.out.println("2: Your last name");
			System.out.println("3: Your phone number");
			System.out.println("4: Your Address");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your new  first name: ");
				person.setFirstName(scanner.nextLine());
				break;
			case 2:
				System.out.println("Enter your new  last name: ");
				person.setLastName(scanner.nextLine());
				break;
			case 3:
				System.out.println("Enter your new  phone number: ");
				person.setPhoneNumber(scanner.nextLong());
				break;
			case 4:
				person.setAddress(Address.createAddress(scanner));
			}
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "";

	}

}
