public class KakuninArray01 {
    public static void main(String[] args) {
        byte[] a1 = { 0, 127 };
        int[] a2;
        // Type mismatch: cannot convert from byte[] to int[]
        a2 = a1;
        System.out.println(a2[1]);
    }
}
