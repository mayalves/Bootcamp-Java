import java.util.Random;

public class DoWhileExample {
  public static void main(String[] args) {
    System.out.println("Calling...");

    do {
      // running repeatedly until someone answers
      System.out.println("Phone ringing");

    } while(calling());

    System.out.println("Hello!!!");
    
  }
  private static boolean calling() {
      boolean answered = new Random().nextInt(3) == 1;
      System.out.println("Answered? " + answered);
      // denying the act of continuing to call 
      return ! answered;
  }
}
