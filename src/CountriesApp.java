import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		boolean proceed = true;
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Countries Maintenance App!");
		
		while (proceed) {
			int userInput = Validator.getInt(scan,
					 "\nEnter menu number: \n"
							+ "1 - See the list of countries \n" + "2 - Add country\n" + "3 - Exit\n",
					1, 3);

			if (userInput == 1) {
				listCountries();
			} else if (userInput == 2) {
				addCountry(scan);
			} else {
				proceed = false;
				System.out.println("Thank you for using the Countries Maintenance App");
			}
		}

		scan.close();
	}

	public static void listCountries() {
		CountriesTextFile.readToFile();
	}

	public static void addCountry(Scanner scan) {
		String userCountry = Validator.getStringLine(scan, "Enter country: ");
		CountriesTextFile.writeToFile(userCountry);
	}

}
