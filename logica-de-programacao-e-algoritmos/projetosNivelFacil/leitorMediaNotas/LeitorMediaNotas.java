package projetosNivelFacil.leitorMediaNotas;

import java.util.Scanner;

public class LeitorMediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota do primeiro semestre:");
        double primeiro = sc.nextDouble();
        System.out.println("Digite a sua nota do segundo semestre:");
        double segundo = sc.nextDouble();


        double resultado = primeiro + segundo;

        System.out.printf("NOTA FINAL = %.1f%n", resultado);

        if (resultado < 60 ) {
            System.out.printf("REPROVADO");
        }
   }  
}
