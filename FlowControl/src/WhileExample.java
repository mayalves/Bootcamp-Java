import java.util.concurrent.ThreadLocalRandom;
public class WhileExample {
  public static void main(String[] args) {
    double allowance = 50.0;
    
    while (allowance > 0) {
      double candyPrice = randomValue();
      if (candyPrice > allowance) {
        candyPrice = allowance;
      }
      System.out.println("Price of candy: " + candyPrice + "Value added to cart");
      allowance = allowance - candyPrice;
    }
    System.out.println("Allowance: " + allowance);
    System.out.println("Maria spent all her allowance on candies"); 
  }
  private static double randomValue(){
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
