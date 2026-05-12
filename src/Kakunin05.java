public class Kakunin05 {
    public static void main(String[] args) {
        int[] a;
        a = new int[3];
        for (int i = 0; i < 3; i++)
            a[i] += i * 10;

        System.out.print(a[0] + ":" + a[1] + ":" + a[2]);
    }
}
