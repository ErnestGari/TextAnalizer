import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        System.out.println("Žodžių skaičius: " + veiksmai.zodziuSkait(text));
        System.out.println("Simbolių skaičius: " + veiksmai.charSkait(text));
        System.out.println("Dažniausiai pasikartojantis simbolis: " + veiksmai.daznChar(text));
        System.out.println("Atvirkštinis tekstas: " + veiksmai.reverseText(text));
    }
}