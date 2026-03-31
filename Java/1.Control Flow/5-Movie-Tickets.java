import java.util.Scanner;

public class CodeChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
    
    System.out.println("Enter the day of the week (1-7):");
    int day = scanner.nextInt();
    
    if (age <= 12) {
      System.out.println("Ticket $7");
    } else if (age <= 17) {
      System.out.println("Ticket $10");
    } else if (age <= 64 && day >= 1 && day <= 5) {
      System.out.println("Ticket $13");
    } else if (age <= 64 && day >= 6 && day <= 7) {
      System.out.println("Ticket $15");
    } else if (age >= 65 && day >= 1 && day <= 5) {
      System.out.println("Ticket $8");
    } else if (age >= 65 && day >= 6 && day <= 7) {
      System.out.println("Ticket $10");
    } else {
      System.out.println("Invalid input");
    }
  }
}