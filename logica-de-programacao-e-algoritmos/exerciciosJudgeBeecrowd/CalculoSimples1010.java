import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int cod1 = sc.nextInt();
        int numeropcs1 = sc.nextInt();
        double preço1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int numeropcs2 = sc.nextInt();
        double preço2 = sc.nextDouble();

        double total = (numeropcs1 * preço1) + (numeropcs2 * preço2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        


        sc.close();

    }
}
