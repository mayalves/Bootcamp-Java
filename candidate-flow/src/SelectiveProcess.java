import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class SelectiveProcess {
    public static void main(String[] args) {
        String [] candidate = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candi : candidate) {
            gettingInTouch(candi);
        }



     /* analyzeCandidate(1900.0);
        analyzeCandidate(2200.0);
        analyzeCandidate(2000.0); */
        // candidateSelection(); 
        // printSelected();
    }

    static void gettingInTouch(String candi) {
        int attemptsMade = 1;
        boolean keepTrying = true;
        boolean answered = false;

        do {
            answered = answer();
            keepTrying = !answered;
            if (keepTrying)
                attemptsMade++;
            else
                System.out.println("Contact made successfully");    
        } while (keepTrying && attemptsMade < 3);
        if (answered) 
            System.out.println("We got in touch with " + candi + " in the " + attemptsMade + " attempt");
        else
        System.out.println("We were unable to contact with " + candi + ", MAXIMUM NUMBER OF ATTEMPTS " + attemptsMade + " attempts made");

    }


    // Auxiliary method
    static boolean answer(){
        return new Random().nextInt(3) == 1;
    }

    static void printSelected(){
        String [] candidate = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candi : candidate) {
            System.out.println("The selected candidate was: " + candi);
        }
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
                System.out.println("The candidate " + candte + " was selected for the vacancy");
                selectedCandidate++;
            }
            currentCandidate++;
        }
    }

    static double desiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
