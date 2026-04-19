import java.util.Scanner;

public class Salario1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salary = (horas * valorPorHora);

        System.out.println("NUMBER = "+ numero);
        System.out.printf("SALARY = U$ %.2f%n", salary);








        sc.close();
        
    }
    
}
