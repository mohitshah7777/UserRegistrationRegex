import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration{

	static Scanner input = new Scanner(System.in);

	//UC1 Firstname starts with cap and has min 3 characters
	public static void userFirstName() {

		while(true)
		{
			String firstName = input.nextLine();
			boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,14}$",firstName);
			if (result == true)
			{
				System.out.println("Entered First Name is Valid: " +firstName);
				break;
			}
			else
			{
				System.out.println("Invalid First Name! Please Re-enter The First Name:");
			}
		}
	}

	//UC2 Lastname starts with cap and has min 3 characters
	public static void userLastName() {

		while(true)
		{
			String lastName = input.nextLine();
			boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,14}$",lastName);
			if (result == true)
			{
				System.out.println("Entered Last Name is Valid: " +lastName);
				break;
			}
			else
			{
				System.out.println("Invalid Last Name! Please Re-enter The Last Name:");
			}
		}
	}


	public static void main(String[] args){

		System.out.print("Enter First Name = ");
		userFirstName();
		System.out.print("Enter Last Name = ");
		userLastName();
	}
}
