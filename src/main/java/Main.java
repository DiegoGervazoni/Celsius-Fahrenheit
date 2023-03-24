import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char caractere;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fah = (9 * celsius) / 5 + 32;

            System.out.printf("Fahrenheit: %.1f", fah);
            sc.nextLine();

            System.out.print("\nDeseja repetir? (s/n): ");
            caractere = sc.nextLine().charAt(0);

        } while (caractere == 's');

        System.out.println("Fim do programa. Obrigado por utilizar!");

        sc.close();
    }
}
