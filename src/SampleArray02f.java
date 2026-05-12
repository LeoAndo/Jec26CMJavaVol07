public class SampleArray02f {
    public static void main(String[] args) {
        int[] array;
        array = new int[3];
        System.out.println(array[3]);
        // 実行時エラー
        /*
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
         * out of bounds for length 3 at SampleArray02f.main(SampleArray02f.java:5)
         */
    }
}
