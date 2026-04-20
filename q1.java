import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, product = 1;
        double sqSum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                product *= i;
                sqSum += Math.pow(i, 2);
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Square Sum: " + sqSum);
    }
}
