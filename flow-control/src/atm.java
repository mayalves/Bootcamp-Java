public class atm {
    public static void main(String[] args) {
       Double balance = 25.0;
       Double amountRequested = 17.0;

       if (amountRequested < balance) {
        balance = balance - amountRequested;

        System.out.println(balance);
        
       }

    }
}
