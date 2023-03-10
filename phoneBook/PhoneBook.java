package phoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> phoneBook = new ArrayList<Person>();

		boolean runProgram = true;
		
		while(runProgram) {
			
			System.out.println("Please enter a number for what you'd like to do: ");
			System.out.println("1: Add Person to phonebook");
			System.out.println("2: Update Person in phonebook ");
			System.out.println("3: Remove Person from phonebook ");
			System.out.println("4: View phonebook ");
			System.out.println("5: Exit phonebook (All data will be lost, get a real database)");
			
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				Address address = Address.createAddress(scanner);
				Person case1person = Person.createPerson(scanner, address);
				phoneBook.add(case1person);
				System.out.println("You have been added to the phonebook. Thank you.");
				break;
			case 2:
				Person case2person = findPersonInPhoneBook(phoneBook, scanner);
				
				Person.updatePerson(scanner, case2person);
				break;
			case 3:
				Person case3person = findPersonInPhoneBook(phoneBook, scanner);
				if(case3person != null) {
					phoneBook.remove(case3person);
				}
				break;
			case 4:
				for(Person p : phoneBook ) {
					System.out.println(p.personalInfo);
				}
				break;
			case 5:
				System.out.println("Goodbye");
				runProgram = false;
				break;
			default:
				System.out.println("Please enter a valid entry");
			}
		}
	}
	
	public static Person findPersonInPhoneBook(ArrayList<Person> phoneBook, Scanner scanner) {
		System.out.println("Please enter a phone number to search by: ");
		long phoneNumber = scanner.nextLong();
		for(Person p : phoneBook) {
			if(p.phoneNumber == phoneNumber) {
				return p;
				
			}
		}
		System.out.println("Phone number does not match any in our database");
		return null;
	}

}
