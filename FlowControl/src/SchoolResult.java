public class SchoolResult {
  public static void main(String[] args) {
    int grade = 8;

    String result = grade >= 7 ? "Approved" : grade >= 5 && grade < 7 ? "Recovery test" : "Failed";

    System.out.println(result);
/* 
    if (grade >= 7) {
      System.out.println("Approved");
    }
      else if (grade >= 5 && grade < 7) {
        System.out.println("Recovery test");
      }
    else {
      System.out.println("Failed");
    }
*/ 
  } 
}
