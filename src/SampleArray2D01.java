public class SampleArray2D01 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int[][] array = new int[2][3];

        array[0][0] = 11;
        array[0][1] = 12;
        array[0][2] = 13;
        array[1][0] = 14;
        array[1][1] = 15;
        array[1][2] = 16;

        System.out.println("array[0][0] = " + array[0][0]);
        System.out.println("array[0][1] = " + array[0][1]);
        System.out.println("array[0][2] = " + array[0][2]);
        System.out.println("array[1][0] = " + array[1][0]);
        System.out.println("array[1][1] = " + array[1][1]);
        System.out.println("array[1][2] = " + array[1][2]);
    }
}
