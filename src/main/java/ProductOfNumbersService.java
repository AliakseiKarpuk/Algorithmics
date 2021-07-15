import java.util.Arrays;

import static java.lang.Math.max;

public class ProductOfNumbersService {

    public static void main(String[] args) {

        // int array[] = {-10, 8, 4, 2, 1, 1, -10};
        int array[] = {-10, 8};
        // Можно создать метод на входе у которогу будет массив
        Arrays.sort(array);
        int length = array.length; // можно не заводить лишнюю переменную без надобности
        try {
            int temp = max(array[0] * array[1] * array[length - 1], array[length - 1] * array[length - 2] * array[length - 3]);
            System.out.println(temp);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Необходимо ввести не менее 3 чисел!");
        }
        /*
            1. Отсутствует тестовое покрытие для функции , неудобно менять матрицу для проверки
            2. Тестовое покрытие должно быть в отдельном файле в папке с именем test
            3. В место System.out.println лучше использовать логи
            4. Строка кода должна помещать до белой линии чтобы не надо было скролить в лево
            5. Отсутствует Джавадок.
            6. Отдельные задачи на мой взгляд лучше либо разделять на проекты либо хотябы на отдельные модули,
            не понятно какой клас с кем взоимодействует.

         */
    }
}
