public class SampleArray02g {
    public static void main(String[] args) {
        int[] ai;
        // Type mismatch: cannot convert from byte[] to int[]Java(16777233)
        ai = new byte[5];
    }
}
