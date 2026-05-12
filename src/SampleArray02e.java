public class SampleArray02e {
    public static void main(String[] args) {
        boolean[] array;
        // Type mismatch: cannot convert from long to intJava(16777233)
        array = new boolean[1L];
    }
}
