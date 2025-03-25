import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      var livre = new Livre();

      while (true) {
          livre.creationLivre();
            System.out.println("Do you want to add another book? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            if (response.equals("no")) {
                break;
            }
      }


    }
}