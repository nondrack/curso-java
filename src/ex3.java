import java.util.Scanner;

public class ex3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.println("Digite primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite segundo numero: ");
        b = scanner.nextInt();
        System.out.println("Digite terceiro numero: ");
        c = scanner.nextInt();
        System.out.println("Digite quarto numero: ");
        d = scanner.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.printf("Diferenca = %d", diferenca);

    }
}
