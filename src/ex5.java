import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Integer id1, id2, qt1, qt2;
        Double vl1, vl2, valor;

        System.out.println("Digte o ID da peça 1, quatidade de peças: , valor unitario: ");
        id1 = scanner.nextInt();
        qt1 = scanner.nextInt();
        vl1 = scanner.nextDouble();
        System.out.println("Digte o ID da peça 2, quatidade de peças: , valor unitario: ");
        id2 = scanner.nextInt();
        qt2 = scanner.nextInt();
        vl2 = scanner.nextDouble();

        valor = (qt1 * vl1) + (qt2 * vl2);

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);



    }
}
