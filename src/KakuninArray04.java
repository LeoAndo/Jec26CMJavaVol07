public class KakuninArray04 {
    public static void main(String[] args) {
        int[] a1 = { 10, 20 };
        int[] a2 = a1;
        a2[0] = 1000;
        System.out.println(a1[0]);
        System.out.println(a1[1]);
    }
    // 1000
    // 20
}
