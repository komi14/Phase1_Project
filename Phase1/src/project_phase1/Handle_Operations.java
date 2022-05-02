package project_phase1;

import java.util.List;
import java.util.Scanner;

public class Handle_Operations {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Operation_Menu.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					Files_Operations.displayAllFiles("main");
					break;
				case 2:
					Handle_Operations.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Operation_Menu.displayFileMenuOptions();
				Files_Operations.createMainFolderIfNotPresent("main");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					
					System.out.println("Enter the name of the file to be added to the directory folder");
					String fileToAdd = sc.next();
					
					Files_Operations.createFile(fileToAdd, sc);
					
					break;
				case 2:
					
					System.out.println("Enter the name of the file to be deleted from directory folder");
					String fileToDelete = sc.next();
					
					Files_Operations.createMainFolderIfNotPresent("directory");
					List<String> filesToDelete = Files_Operations.displayFileLocations(fileToDelete, "directory");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						Files_Operations.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
						for (String path : filesToDelete) {
							Files_Operations.deleteFileRecursively(path);
						}
					}
					
					break;
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from directory folder");
					String fileName = sc.next();
					
					Files_Operations.createMainFolderIfNotPresent("directory");
					Files_Operations.displayFileLocations(fileName, "directory");

					
					break;
				case 4:
					
					return;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				handleFileMenuOptions();
			}
		} while (running == true);
	}



	}

