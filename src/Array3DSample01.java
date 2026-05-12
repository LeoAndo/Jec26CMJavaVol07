public class Array3DSample01 {
    public static void main(String[] args) {
        // new int[Ｚ軸の長さ][Ｙ軸の長さ][Ｘ軸の長さ]
        int[][][] array = new int[2][3][4];
        array[0][0][0] = 100;
        array[0][0][1] = 101;
        array[0][0][2] = 102;
        array[0][0][3] = 103;
        array[0][1][0] = 104;
        array[0][1][1] = 105;
        array[0][1][2] = 106;
        array[0][1][3] = 107;
        array[0][2][0] = 108;
        array[0][2][1] = 109;
        array[0][2][2] = 110;
        array[0][2][3] = 111;

        array[1][0][0] = 200;
        array[1][0][1] = 201;
        array[1][0][2] = 202;
        array[1][0][3] = 203;
        array[1][1][0] = 204;
        array[1][1][1] = 205;
        array[1][1][2] = 206;
        array[1][1][3] = 207;
        array[1][2][0] = 208;
        array[1][2][1] = 209;
        array[1][2][2] = 210;
        array[1][2][3] = 211;

        int zLength = array.length;
        int yLength = array[0].length;
        int xLength = array[0][0].length;
        System.out.printf("Z軸の長さ: %d, Y軸の長さ: %d, X軸の長さ: %d \n", zLength, yLength, xLength);
        for (int z = 0; z < zLength; z++) {
            for (int y = 0; y < yLength; y++) {
                for (int x = 0; x < xLength; x++) {
                    System.out.printf("array[%d][%d][%d] = %d \n", z, y, x, array[z][y][x]);
                }
            }
        }
    }
}
