package projetosNivelFacil.conversorDeMoedas;

import java.util.Locale;
import java.util.Scanner;


public class Project1 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US); 

    Scanner sc = new Scanner(System.in);

System.out.println("Enter the value in Reais (BRL):");
        double reais = sc.nextDouble();

System.out.println("Enter today's Dollar exchange rate:");
        double exchange = sc.nextDouble();

        double dollars = reais / exchange;

System.out.printf("Value converted to dollars is: $ %.2f dollars%n", dollars);




    sc.close();
    }
    
}
