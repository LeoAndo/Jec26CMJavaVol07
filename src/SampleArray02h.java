public class SampleArray02h {
    public static void main(String[] args) {
        byte[] ab;
        // Type mismatch: cannot convert from int[] to byte[]Java(16777233)
        ab = new int[5];
    }
}
