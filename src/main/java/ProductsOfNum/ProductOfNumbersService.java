package ProductsOfNum;

import java.util.Arrays;

import static java.lang.Math.max;

public class ProductOfNumbersService {

    public static int productOfNumber(int[] numbers){

        Arrays.sort(numbers);
        int length = numbers.length;
        try {
            int temp = max(numbers[0] * numbers[1] * numbers[length - 1], numbers[length - 1] * numbers[length - 2] * numbers[length - 3]);
            return temp;
        } catch (IndexOutOfBoundsException ex) {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(productOfNumber(new int[]{2, 4, -10, -10, 8}));
    }
}
