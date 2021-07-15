package Matrix;

import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MatrixService {
    /*
           1. Отсутствует Джавадок.
           2. Отдельные задачи на мой взгляд лучше либо разделять на проекты либо хотябы на отдельные модули,
           не понятно какой клас с кем взоимодействует.
    */
    private Integer array[][];

    public MatrixService(Integer[][] array, int lengthRow, int lengthColumn) {
        this.array = new Integer[lengthRow][lengthColumn];
        for (int i = 0; i < lengthRow; i++) {
            for (int j = 0; j < lengthRow; j++) {
                this.array[i][j] = array[i][j];
            }
        }
    }

    public static String readFromFile() {
        String file = "";
        try {
            file = new String(Files.readAllBytes(Paths.get("matrix.txt")));
        } catch (IOException e) {
            log.info("Не найден файл");
        }
        return file;
    }

    public static int countOfRows() {
        List<String> rows = new ArrayList<>();
        Path layout = Paths.get("matrix.txt");
        try {
            rows = Files.readAllLines(layout);

        } catch (IOException e) {
            log.info("Не найдены строки символов!");
        }
        System.out.println(); // зачем это здесь?
        return rows.size();
    }

    @Override
    public String toString() {
        return matrixPrint();
    }

    private String matrixPrint() {
        StringBuffer matrixString = new StringBuffer();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                matrixString.append(this.array[i][j]).append(", ");
            }
            matrixString.append("\n");
        }
        return "" + matrixString;
    }

    // Вданной функции должен быть перебор элементов и перемена местами, а не присвоение в правильном порядке
    private static Integer[][] matrixMainDiagonalBuilder() {

        int matrixSize = MatrixService.countOfRows();

        Integer[][] array = new Integer[matrixSize][matrixSize];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    public static boolean matrixWriter() {

        try {

            Integer[][] array = matrixMainDiagonalBuilder(); // готовая матрица присваивается констуктору класса
            MatrixService arrayMatrix = new MatrixService(array, array.length, array[0].length);

            //отсутствует момент считки названия файла с консоли
            FileWriter writer = null;
            try {
                writer = new FileWriter("matrix.txt", false);
            } catch (IOException e) {
                log.info("Не найден файл!");
            }

            try {
                writer.write(arrayMatrix.toString());
                writer.flush();
            } catch (IOException e) {
                log.info("Ошибка при записи файла!");
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
