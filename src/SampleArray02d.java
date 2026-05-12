public class SampleArray02d {
    public static void main(String[] args) {
        short[] array;
        // Type mismatch: cannot convert from double to intJava(16777233)
        array = new short[1.1];
    }
}
