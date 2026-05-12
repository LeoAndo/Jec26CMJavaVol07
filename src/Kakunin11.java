public class Kakunin11 {
    public static void main(String[] args) {
        int[] ia = { 10, 20 };
        double[] da = { 1.1, 2.2 };
        int[] ia2 = new int[2];
        ia2[0] = ia[0] * da[0];
        ia2[1] = ia[1] * da[1];
        System.out.println(ia2[0]);
        System.out.println(ia2[1]);
    }
}
