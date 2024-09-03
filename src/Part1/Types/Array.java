package Part1.Types;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] secondArray = {2, 5, 4, 3, 1};
        System.out.println(secondArray.length);
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));
    }
}
