package project_phase1;

public class Operation_Menu {



	public static void printWelcomeScreen(String projectName, String developerName) {
		String companyDetails = String.format("------------------------------------------------\n"
				+ " Welcome to %s. \n" + " This application was developed by %s.\n"
				+ "--------------------------------------------------\n", projectName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ " Retrieve all file names in the  folder\n"
				+ " Search, add, or delete files in  folder.\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n--------- Select any option number from below and press Enter --------\n\n"
				+ "1) Retrieve all files inside the folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n------- Select any option number from below and press Enter -------\n\n"
				+ "1) Add a file to directory folder\n" + "2) Delete a file from directory folder\n"
				+ "3) Search for a file from directory folder\n" + "4) Display Previous Menu\n" + "5) Exit program :) \n";

		System.out.println(fileMenu);
	}

}