public class SampleArrayAsRef06 {
    public static void main(String[] args) {
        int[] array1 = { 10, 20, 30 };
        int[] array2;

        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array1[1] = " + array1[1]);
        System.out.println("array1[2] = " + array1[2]);

        array2 = array1;

        System.out.println("array2[0] = " + array2[0]);
        System.out.println("array2[1] = " + array2[1]);
        System.out.println("array2[2] = " + array2[2]);
        System.out.println();

        array2[0] = 100;

        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array1[1] = " + array1[1]);
        System.out.println("array1[2] = " + array1[2]);

        System.out.println("array2[0] = " + array2[0]);
        System.out.println("array2[1] = " + array2[1]);
        System.out.println("array2[2] = " + array2[2]);
    }
    // array1[0] = 10
    // array1[1] = 20
    // array1[2] = 30
    // array2[0] = 10
    // array2[1] = 20
    // array2[2] = 30

    // array1[0] = 100
    // array1[1] = 20
    // array1[2] = 30
    // array2[0] = 100
    // array2[1] = 20
    // array2[2] = 30
}
