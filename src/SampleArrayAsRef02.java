public class SampleArrayAsRef02 {
    public static void main(String[] args) {
        int[] ia = new int[3]; // int[]型
        byte[] ib = new byte[3]; // byte[]型
        ia = ib; // Type mismatch: cannot convert from byte[] to int[]
    }
}
