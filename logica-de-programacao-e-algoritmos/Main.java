import java.util.Locale;

public class Main {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);  
      
        double x;
        double y;
        double z;
        double soma;
 System.out.println("Hello World");

        x =  111;
        y =  75;
        z = 85;
        soma = (x - y) * z;

System.out.println("Soma = " + soma);


        char genderCode= 'F';
        String genderName= "Feminine";
System.out.println(genderCode);
System.out.println(genderName);

        double price1 = 54.58;
        double price2 = 41.89;

        double soma2 = (price1 + price2);
System.out.println(soma2);

        int value = 9000;
System.out.println(value*0.2);


System.out.print("Hello");
System.out.println(" good morning");

        double a = 32.8596;
System.out.println(a);
System.out.printf(Locale.US,"%.2f%n", a);


        String name = "Fernanda";
        int age = 25;
        double income = 4000.0;
        
System.out.printf("%s have %d years and wins $ %.2f dollars%n" , name, age, income);

        double b = 6.0;
        double B = 8.0;
        double h = 5.0;

        double area = (b + B) / 2.0 * h;

System.out.println(area);
    }
}
