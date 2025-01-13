import java.util.Scanner;

class CrimeRecordsApp {
    private CrimeManager crimeManager;

    public CrimeRecordsApp(CrimeManager crimeManager) {
        this.crimeManager = crimeManager;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("Welcome to Crime Records Management System!");
        System.out.println("***********************************************");

        int choice;
        do {
            System.out.println("\n1. Record Theft Incident");
            System.out.println("2. Record Assault Incident");
            System.out.println("3. View Crime Records");
            System.out.println("4. Analyze Crime Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    TheftRecord theftRecord = new TheftRecord("THF", "Theft", "Theft incidents");
                    theftRecord.recordTheft();
                    crimeManager.recordCrime(theftRecord);
                    break;
                case 2:
                    AssaultRecord assaultRecord = new AssaultRecord("ASL", "Assault", "Assault incidents");
                    assaultRecord.recordAssault();
                    crimeManager.recordCrime(assaultRecord);
                    break;
                case 3:
                    crimeManager.viewCrimeRecords();
                    break;
                case 4:
                    crimeManager.analyzeCrimeData();
                    break;
                case 5:
                    System.out.println("\n***********************");
                    System.out.println("Exiting Crime Records Management System. Goodbye!");
                    System.out.println("**************************");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}