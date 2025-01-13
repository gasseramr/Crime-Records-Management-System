import java.util.ArrayList;

class CrimeManager {
    private ArrayList<CrimeCategory> crimeRecords = new ArrayList<>();

    public void recordCrime(CrimeCategory crimeCategory) {
        crimeRecords.add(crimeCategory);
        System.out.println("Crime incident recorded successfully!");
    }

    public void viewCrimeRecords() {
        System.out.println("\n** Viewing Crime Records **");
        for (CrimeCategory crimeCategory : crimeRecords) {
            if (crimeCategory instanceof TheftRecord) {
                ((TheftRecord) crimeCategory).displayTheftDetails();
            } else if (crimeCategory instanceof AssaultRecord) {
                ((AssaultRecord) crimeCategory).displayAssaultDetails();
            }
        }
    }

    public void analyzeCrimeData() {
        System.out.println("\n** Analyzing Crime Data **");

        // Simple analysis: Display total number of recorded incidents
        int totalIncidents = crimeRecords.size();
        System.out.println("Total number of recorded incidents: " + totalIncidents);

        // Simple analysis: Find the most common crime category
        String mostCommonCategory = findMostCommonCategory();
        System.out.println("Most common crime category: " + mostCommonCategory);
    }

    private String findMostCommonCategory() {
        // Logic to find the most common crime category
        if (crimeRecords.isEmpty()) {
            return "No incidents recorded yet";
        }

        // Count occurrences of each category
        ArrayList<String> categories = new ArrayList<>();
        for (CrimeCategory crimeCategory : crimeRecords) {
            categories.add(crimeCategory.getCatogoryName());
        }

        // Find the most common category
        String mostCommonCategory = null;
        int maxOccurrences = 0;

        for (String category : categories) {
            int occurrences = countOccurrences(categories, category);
            if (occurrences > maxOccurrences) {
                mostCommonCategory = category;
                maxOccurrences = occurrences;
            }
        }

        return mostCommonCategory;
    }

    private int countOccurrences(ArrayList<String> list, String element) {
        int count = 0;
        for (String listItem : list) {
            if (listItem.equals(element)) {
                count++;
            }
        }
        return count;
    }
}