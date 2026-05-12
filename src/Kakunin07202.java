public class Kakunin07202 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2 }, { 3, 4, 5 } };
        // Type mismatch: cannot convert from int to int[]
        int[] b[] = { 11, 12, 13 };
        int c[][] = { { 10 }, { 20 }, { 30 } };
        // Type mismatch: cannot convert from int to int[]
        int d[][] = { 0, 0, 0 };
        double[][] e = { { 1.1, 1.2, 1.3 }, { 2.1 } };
    }
}
