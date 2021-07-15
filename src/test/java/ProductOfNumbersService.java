import java.util.Arrays;

import static java.lang.Math.max;

public class ProductOfNumbersService {

    public static void main(String[] args) {

        int array[] = {-10, 8, 4, 2, 1, 1, -10};
        Arrays.sort(array);
        int length = array.length;
        try {
            int temp = max(array[0] * array[1] * array[length - 1], array[length - 1] * array[length - 2] * array[length - 3]);
            System.out.println(temp);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Необходимо ввести не менее 3 чисел!");
        }

    }
}
