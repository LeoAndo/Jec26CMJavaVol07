public class SampleArrayFor01b {
    public static void main(String[] args) {
        // 配列の宣言・生成
        int[] score = { 89, 56, 24 };

        // 配列要素の表示(拡張 for 文を利用)
        for (int x : score) {
            System.out.println(x);
        }
    }
    // 89
    // 56
    // 24
}
