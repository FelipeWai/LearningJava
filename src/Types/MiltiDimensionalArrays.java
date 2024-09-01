package Types;

import java.util.Arrays;

public class MiltiDimensionalArrays {
    public static void main(String[] args) {
        int [][] bidimensional = new int[2][3];
        bidimensional[0][0] = 1;
        System.out.println(Arrays.deepToString(bidimensional));
        // int [][][] tridimensional = new int[2][3][5];
        int[][] numbers = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));
    }
}
