import java.util.Locale;
import java.util.Scanner;

public class Funcoesmat {
    public static void main(String[] args) {
        Locale setLocale =(Locale.US);
        Scanner sc = new Scanner (System.in);

        double a = 24.0;
        double b = 4.0;
        double c = -6;
        double A, B, C;

        A = Math.sqrt(a); //Variavel recebe raiz quadrada
        B = Math.sqrt(b);
        C = Math.sqrt(55);

    System.out.println("Raiz quadrada de " + a + " = " + A);
    System.out.println("Raiz quadrada de " + b + " = " + B);
    System.out.println("Raiz quadrada de 55" + C);

    
        A = Math.pow(a, b); //Variavel recebe o resultado de a elevado a b
        B = Math.pow(a, 2.0);
        C = Math.pow(5.0, 2.0);

    System.out.println(a + " elevado a " + b + " = " + A);
    System.out.println(a + " elevado ao quadrado = " + B);
    System.out.println(5 + " elevado ao quadrado = " + C);

        
        A = Math.abs(b); //variavel recebe valor absoluto de c
        B = Math.abs(c);
        
    System.out.println("Valor absoluto de " + b + " = " + A);
    System.out.println("Valor absoluto de " + c + " = " + B);

    



        sc.close();
    }
    
}
