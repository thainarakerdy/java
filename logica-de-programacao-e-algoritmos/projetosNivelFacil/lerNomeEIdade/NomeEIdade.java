package projetosNivelFacil.lerNomeEIdade;
import java.util.Locale;
import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        String name1 = sc.next();
        int age1 = sc.nextInt();

        String name2 = sc.next();
        int age2 = sc.nextInt();
    
        double ageMedia = (age1 + age2) /2.0;

        System.out.printf("The age media of %s and %s is the %.1f years.", name1, name2, ageMedia);

        sc.close();
    }
    
}
