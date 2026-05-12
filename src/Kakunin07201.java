public class Kakunin07201 {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int[] b[] = new int[2][3];
        int c[][] = new int[2][3];
        // Type mismatch: cannot convert from byte[][] to int[][]
        int[] d[] = new byte[2][3];
        // Variable must provide either dimension expressions or an array initializer
        double[][] e = new double[][];
    }
}
