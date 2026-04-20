import java.util.*;

public class q2 {

    static int rec(int n) {
        return (n == 1) ? 1 : n + rec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not natural");
            return;
        }

        System.out.println("Recursive: " + rec(n));
        System.out.println("Formula: " + (n * (n + 1) / 2));
    }
}
