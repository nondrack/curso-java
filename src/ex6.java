import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Double A,B,C, tr,cr,tp,qd,rt;
        Double pi = 3.14159;

        System.out.println("Digite o valor de A,B,C: ");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        tr = (A * C)/2;
        cr = Math.pow(C,2)*pi;
        tp = ((A + B) * C)/2;
        qd = (Math.pow(B,2));
        rt = A * B;
        Locale.setDefault(Locale.US);
        System.out.printf("Triangulo: %.3f%n Circulo: %.3f%n Trapesio: %.3f%n Quadrado: %.3f%n Retangulo %.3f%n", tr,cr,tp,qd,rt);

    }
}
