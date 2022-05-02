package project_phase1;

public class Phase1_ProjectCoreJava {
	

		public static void main(String[] args) {
			
			Files_Operations.createMainFolderIfNotPresent("directoryS");
			
		     Operation_Menu.printWelcomeScreen("Project of Phase1", "Komal Vishwakarma");
			
			Handle_Operations.handleWelcomeScreenInput();
		}

		
	}

