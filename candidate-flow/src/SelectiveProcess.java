public class SelectiveProcess {
    public static void main(String[] args) {
        analyzeCandidate(1900.0);
        analyzeCandidate(2200.0);
        analyzeCandidate(2000.0);
    }
    static void analyzeCandidate(double desiredSalary){
        double baseSalary  = 2000.0;
        if (baseSalary > desiredSalary) {
            System.out.println("Call the candidate!"); 
        } else if (baseSalary == desiredSalary) {
            System.out.println("Call the candidate!");
        } else {
            System.out.println("Waiting for the results of the other candidates");
        }
    }
}
