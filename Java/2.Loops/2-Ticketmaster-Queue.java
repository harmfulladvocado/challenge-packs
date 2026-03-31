public class CodeChallenge {
  public static void main(String[] args) {
    for (int i = 2000; i > 0; i -= 200) {
      System.out.println("There are " + i + " people ahead of you.");
    }
    System.out.println("There are 0 people ahead of you. Your turn!");
  }
}