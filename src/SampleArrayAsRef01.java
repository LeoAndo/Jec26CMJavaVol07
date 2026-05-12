public class SampleArrayAsRef01 {
    public static void main(String[] args) {
        int[] ia = new int[3]; // int[]型
        byte[] ib = new byte[3]; // byte[]型
        ia = (int[]) ib; // Cannot cast from byte[] to int[]
    }
}
