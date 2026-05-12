public class SampleArrayAsRef03 {
    public static void main(String[] args) {
        int[] ia = new int[3]; // int[]型
        String[] is = new String[3]; // String[]型
        ia = is; // Type mismatch: cannot convert from String[] to int[]
    }
}
