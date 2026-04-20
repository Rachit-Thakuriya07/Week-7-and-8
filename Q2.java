import java.util.*;

public class Q2 {

    // count digits
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // digits array
    static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    // duck number (contains 0 but not starting with 0)
    static boolean isDuck(int n) {
        return String.valueOf(n).contains("0");
    }

    // armstrong
    static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int sum = 0;
        for (int x : d)
            sum += Math.pow(x, d.length);
        return sum == n;
    }

    // largest & second largest
    static void largestTwo(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    // smallest & second smallest
    static void smallestTwo(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min2 = x;
            }
        }
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digits count: " + countDigits(n));
        System.out.println("Duck Number: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));

        largestTwo(digits);
        smallestTwo(digits);
    }
}