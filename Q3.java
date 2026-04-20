import java.util.Scanner;

public class Q3 {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sides of triangle (in meters): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Number of rounds to complete 5km run: " + rounds);

        sc.close();
    }
}
