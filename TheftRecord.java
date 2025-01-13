
import java.util.Scanner;
class TheftRecord extends CrimeCategory {
    private String incidentID;
    private String location;
    private String incidentDescription;
    private String dateOfIncident;

    private static final String CATOGORYNAME = "Theft";

    public TheftRecord(String categoryID, String name, String description) {
        super(categoryID, name, description, CATOGORYNAME);
    }

    public void recordTheft() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n** Recording Theft Incident **");

        System.out.print("Enter incident ID: ");
        incidentID = scanner.nextLine();

        System.out.print("Enter incident name: ");
        setName(scanner.nextLine());

        System.out.print("Enter incident location: ");
        location = scanner.nextLine();

        System.out.print("Enter incident description: ");
        incidentDescription = scanner.nextLine();

        System.out.print("Enter date of incident: ");
        dateOfIncident = scanner.nextLine();

        System.out.println("Theft incident recorded successfully!");
    }

    public void displayTheftDetails() {
        System.out.println("\n** Theft Incident Details **");
        System.out.println("Incident ID: " + incidentID);
        System.out.println("Name: " + getName());
        System.out.println("Location: " + location);
        System.out.println("Description: " + incidentDescription);
        System.out.println("Date: " + dateOfIncident);
    }
}