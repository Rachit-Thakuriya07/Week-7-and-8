import java.util.Random;

public class Q1 {

    // sum
    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    // mean
    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // shortest
    static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x < m) m = x;
        return m;
    }

    // tallest
    static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        // generate heights 150–250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + r.nextInt(101);
        }

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nMean: " + mean(heights));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}