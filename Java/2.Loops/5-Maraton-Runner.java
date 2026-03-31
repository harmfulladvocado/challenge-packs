import java.util.Scanner;

public class CodeChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int goal = 1000;
    int total = 0;

    while (total < goal) {
      System.out.print("How much to donate? ");
      int donation = scanner.nextInt();
      total += donation;
      System.out.println("Total: $" + total);
    }

    System.out.println("Goal reached!");
  }
}