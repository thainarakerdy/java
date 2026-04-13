import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;   
System.out.println("Please, enter a name:");
        x = sc.next();
System.out.println("You typed:" + x);
        
        int y;
System.out.println("Please, enter a age:");
        y = sc.nextInt();
System.out.printf("You typed: %d years%n", y);

                double z;
System.out.println("Please, enter a number:");
        z = sc.nextDouble();
System.out.printf("You typed: %.2f%n", z);

                char a;
System.out.println("Please, enter a char:");
        a = sc.next().charAt(0);
System.out.printf("You typed: %c%n", a);

                int one;
                char two;
                String three;
System.out.println("Please, enter a int, char and a string:");
        one = sc.nextInt();
        two = sc.next().charAt(0);
        three = sc.next();
System.out.printf("You typed: %d, %c and %s%n", one, two, three);



// Agora vou aprender a ler um texto até a quebra de linha 


            String s1, s2, s3;

            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

System.out.println("Enterad Data");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

        sc.close();
    }
    
}
