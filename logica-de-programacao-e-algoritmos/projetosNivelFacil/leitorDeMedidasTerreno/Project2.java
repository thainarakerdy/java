package projetosNivelFacil.leitorDeMedidasTerreno;
import java.util.Locale;
import java.util.Scanner;


public class Project2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        double width;
    System.out.println("Please provide the width measurement of the land:" );
        width = sc.nextDouble();

        double length;
    System.out.println("Please measure the length of the land:" );
        length = sc.nextDouble();

        double price;
    System.out.println("Please provide the price per square meter:" );
        price = sc.nextDouble();

        double area = width * length ;
        double pricetotal = area * price;
    System.out.printf("This area is: %.2f%n", area);  
    System.out.printf("Price total is: %.2f%n", pricetotal);


        sc.close();
    }
}