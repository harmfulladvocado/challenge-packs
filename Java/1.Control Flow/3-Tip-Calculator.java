
public class CodeChallenge {
  public static void main(String[] args) {
    double subtotal = 96.82;
    int option = 20;
    double tip = 0.0;
    
    if (option == 15) {
      tip = subtotal * 0.15;
    } else if (option == 20) {
      tip = subtotal * 0.20;
    } else if (option == 25) {
      tip = subtotal * 0.25;
    } else {
      System.out.println("Invalid tip percentage");
    }
    
    System.out.println("Tip: $" + tip);
  }
}
