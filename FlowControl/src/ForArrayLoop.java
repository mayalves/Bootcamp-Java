public class ForArrayLoop {
// In arrays, the element index starts at zero.
  public static void main(String[] args) {
    String students[] = {"Felipe", "Maria", "Julia", "Marcos"};

    for (int x = 0; x < students.length; x++) {
      System.out.println("The student at index x = " + x + " is " + students[x]);
    }
  }
}
