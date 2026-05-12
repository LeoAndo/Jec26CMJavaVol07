public class Array3DSample02 {
    public static void main(String[] args) {
        int[][][] array = { { { 100, 101, 102, 103 }, { 104, 105, 106, 107 }, { 108, 109, 110, 111 } },

                { { 200, 201, 202, 203 }, { 204, 205, 206, 207 }, { 208, 209, 210, 211 } } };
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
