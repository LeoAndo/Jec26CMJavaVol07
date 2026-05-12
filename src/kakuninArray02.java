public class kakuninArray02 {
    public static void main(String[] args) {
        byte[] a1 = { 0, 127 };
        int[] a2;
        // Cannot cast from byte[] to int[]
        a2 = (int[]) a1;
        System.out.println(a2[1]);
    }
}
