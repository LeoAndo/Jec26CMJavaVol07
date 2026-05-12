public class Kakunin07203 {
    public static void main(String[] args) {
        int[][] a;
        a = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = a[i][j] + i * j;
            }
        }
        System.out.print(a[0][1] + ":" + a[1][2]); // 0:2
    }
}
