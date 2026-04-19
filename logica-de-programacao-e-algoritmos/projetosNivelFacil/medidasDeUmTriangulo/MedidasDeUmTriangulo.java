import java.util.Scanner;


public class MedidasDeUmTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double heigth = sc.nextDouble();

        double area = (base * heigth);
        double perimeter = 2 * (base + heigth);
        double diagonal = Math.sqrt((base * base) + (heigth * heigth));

        System.out.println("AREA = "+ area);
        System.out.println("PERIMETER = " + perimeter);
        System.out.println("DIAGONAL = %.4f%n" + diagonal);




        sc.close();
    }
}
