import java.util.Scanner;

public class ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Digite um numero inteiro: ");
        n1 = sc.nextInt();
        System.out.println("Digite segunndo inteiro: ");
        n2 = sc.nextInt();

        soma = n1 + n2;
        System.out.printf("A soma = %d ", soma);



    }
}
