public class SampleArrayAsRef07 {
    public static void main(String[] args) {
        byte[] a1 = new byte[3];
        short[] a2 = new short[3];
        int[] a3 = new int[3];
        long[] a4 = new long[3];
        float[] a5 = new float[3];
        double[] a6 = new double[3];
        char[] a7 = new char[3];
        boolean[] a8 = new boolean[3];
        String[] a9 = new String[3];

        System.out.println("byte[] : " + a1);
        System.out.println("short[] : " + a2);
        System.out.println("int[] : " + a3);
        System.out.println("long[] : " + a4);
        System.out.println("float[] : " + a5);
        System.out.println("double[] : " + a6);
        System.out.println("char[] : " + a7.toString());
        System.out.println("boolean[]: " + a8);
        System.out.println("String[] : " + a9);
    }
    // byte[] : [B@7de26db8
    // short[] : [S@1175e2db
    // int[] : [I@36aa7bc2
    // long[] : [J@76ccd017
    // float[] : [F@182decdb
    // double[] : [D@26f0a63f
    // char[] : [C@4361bd48
    // boolean[]: [Z@53bd815b
    // String[] : [Ljava.lang.String;@2401f4c3
}
