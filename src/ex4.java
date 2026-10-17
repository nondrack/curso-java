import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
         Integer id;
         Double horas, vph, salario;

         System.out.println("Digite o ID do funcionario: ");
         id = scanner.nextInt();
         System.out.println("Digite as horas trabalhadas referente: ");
         horas = scanner.nextDouble();
         System.out.println("Digite o valor da hora: ");
         vph = scanner.nextDouble();
         salario = horas * vph;

         System.out.printf("ID: %d%n Salario: U$ %.2f", id, salario);


    }
}
