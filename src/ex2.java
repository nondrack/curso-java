import java.util.Locale;
import java.util.Scanner;
public class ex2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double r, a;
        double pi = 3.14159;

        System.out.println("Digite o raio do circulo: ");
        r = scanner.nextDouble();
        a = pi * Math.pow(r,2);
        Locale.setDefault(Locale.US);
        System.out.printf("A = %.4f%n", a);



    }
}
