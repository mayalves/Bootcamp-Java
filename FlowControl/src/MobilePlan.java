public class MobilePlan {
  public static void main(String[] args) {
    String plan = "T"; // B or T
    
    switch (plan) {
      case "T": {
        System.out.println("5 GB Youtube");
        break;
      }
      case "M": {
        System.out.println("Free WhatsApp and Instagram");
        break;
      }
      case "B": {
        System.out.println("100 calls minutes");
        break;
      }    
      default:
        break;
    }
  }
  
}
