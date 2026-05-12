public class kakuninArray03 {
    public static void main(String[] args) {
        int[] a1 = { 10, 20, 30 };
        double[] a2 = new double[3];
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
    }
    // 10.0
    // 20.0
    // 30.0
}
