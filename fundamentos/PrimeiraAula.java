import java.util.Scanner;

 public class PrimeiraAula  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, What's is your name?");
        String name = sc.next();

        System.out.println("What's your age?");
        int age = sc.nextInt();

        System.out.printf("Your name is %s and your age is %d%n years", name, age);



        sc.close();
    }
}
