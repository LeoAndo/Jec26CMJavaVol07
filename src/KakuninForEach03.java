public class KakuninForEach03 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        for (float x : a)
            System.out.print(x + ":");
        // x cannot be resolved to a variable
        System.out.print(x + ":");
    }
}
