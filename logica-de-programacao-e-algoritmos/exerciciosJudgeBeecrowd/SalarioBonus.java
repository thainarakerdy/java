import java.util.Locale;
import java.util.Scanner;


public class SalarioBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();

        double salarybonus = sales * 0.15 + salary;

        System.out.printf("TOTAL = R$ %.2f%n", salarybonus);
    }
}
