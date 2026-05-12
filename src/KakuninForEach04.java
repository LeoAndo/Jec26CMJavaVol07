public class KakuninForEach04 {
    public static void main(String[] args) {
        final int[] data = { 1, 2, 3 };
        A(data);
        System.out.println();
        B(data);
        System.out.println();
        C(data);
        System.out.println();
        D(data);
        System.out.println();
    }

    /*
     * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
     * out of bounds for length 3 at KakuninForEach04.D(KakuninForEach04.java:12) at
     * KakuninForEach04.main(KakuninForEach04.java:7)
     */
    private static void D(int[] data) {
        for (int i = 0; i <= 3; i++) {
            System.out.print(data[i] + " ");
        }
    }

    // 1 2 3
    private static void C(int[] data) {
        for (long d : data) {
            System.out.print(d + " ");
        }
    }

    // 1 2 3
    private static void B(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    // 1 2 3
    private static void A(int[] data) {
        for (int d : data) {
            System.out.print(d + " ");
        }
    }
}
