public class SampleArray02c {
    public static void main(String[] args) {
        byte[] array;
        array = new byte[-1];
        // 実行時エラーになる
        /*
         * Exception in thread "main" java.lang.NegativeArraySizeException: -1 at
         * SampleArray02c.main(SampleArray02c.java:4)
         */
    }
}
