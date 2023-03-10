package phoneBook;

import java.util.Scanner;

public class Address {
	

	String streetName;
	String city;
	String state;
	int zipCode;
	int addressNumber;
	String fullAddress = addressNumber + " " + streetName + " "
						+ city + " " + state + ", " + zipCode;
	
	Address(int addressNumber, String streetName, String city, String state, int zipCode) {
		this.addressNumber = addressNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.addressNumber = addressNumber;
	}
	
	public static Address createAddress(Scanner scanner) {
		System.out.println("Please enter your address information ");
		System.out.println("Your street name: ");
		String streetName = scanner.nextLine();
		System.out.println("Your address number: ");
		int addressNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Your City: ");
		String city = scanner.nextLine();
		System.out.println("Your State: ");
		String state = scanner.nextLine();
		System.out.println("Your ZipCode: ");
		int zipCode = scanner.nextInt();
		
		return new Address(addressNumber, streetName, city, state, zipCode);
		
	}
	
	
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
