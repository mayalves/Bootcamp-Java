import java.util.concurrent.ThreadLocalRandom;
public class SelectiveProcess {
    public static void main(String[] args) {
     /* analyzeCandidate(1900.0);
        analyzeCandidate(2200.0);
        analyzeCandidate(2000.0); */
    }

    static void candidateSelection(){
        // Canditate array
        String [] candidate = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int selectedCandidate = 0;
        int currentCandidate = 0;
        double baseSalary = 2000.0;

        while (selectedCandidate < 5 && currentCandidate < candidate.length) {
            String candte = candidate[currentCandidate];
            double desiredSalary = desiredValue();

            System.out.println("The candidate " + candte + " requested this salary amount: " + desiredSalary);
            if (baseSalary >= desiredSalary) {
                System.out.println("The candidate " + candidate + " was selected for the vacancy");
                selectedCandidate++;
            }
            currentCandidate++;
        }
    }

    static double desiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
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
