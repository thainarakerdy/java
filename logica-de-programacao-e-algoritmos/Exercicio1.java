import java.util.Locale;
public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.23456;

System.out.printf("Products:%n%s, which price is $ %.2f%n", product1, price1);
System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);

System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);

System.out.printf("Measue with eigth decimal places: %f%n"+
        "Rouded (three decimal places): %.3f%n"+
        "US decimal point: %.2f", measure, measure, measure);
    }
    
}
