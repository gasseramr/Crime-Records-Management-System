public class Main {
    public static void main(String[] args) {
        CrimeManager crimeManager = new CrimeManager();
        CrimeRecordsApp crimeApp = new CrimeRecordsApp(crimeManager);
        crimeApp.run();
    }
}

