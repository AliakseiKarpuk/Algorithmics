package Mt;

import java.io.*;
import java.util.Arrays;

public class MatrixServices {

    int size = (int) (Math.random() * 8) + 2;
    Integer[][] array = new Integer[size][size];
    Integer[][] readArray;
    Matrix matrixArray;

    String fileRead = "src/main/java/Mt/MatrixBefore";
    String fileWrite = "src/main/java/Mt/MatrixAfter";


    public boolean writeToFile() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(fileWrite));
            writer.print(newMatrixArray());
            return true;
        } catch (IOException e) {
            System.out.println("Не найден файл");
            ;
        }
        return false;
    }

    public Matrix newMatrixArray() {
        String line1 = readFromFile().toString();
        String[] row = line1.trim().split("\n");
        String[] length = row[0].trim().split(" ");
        int lengthColumn = Integer.parseInt(length[0]);
        int lengthRow = Integer.parseInt(length[0]);
        readArray = new Integer[lengthColumn][lengthRow];

        for (int i = 0; i < row.length - 1; i++) {
            row[i] = row[i + 1];
        }
        String[] stringArrayColumn = Arrays.copyOf(row, row.length - 1);
        for (int i = 0; i < stringArrayColumn.length; i++) {
            String[] stringArrayRow = stringArrayColumn[i].trim().split(" ");
            for (int j = 0; j < stringArrayRow.length; j++) {
                readArray[i][j] = Integer.parseInt(stringArrayRow[j]);
            }
        }
        return matrixArray = new Matrix(readArray, lengthColumn, lengthRow);
    }

    public StringBuilder readFromFile() {

        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileRead));
             PrintWriter writer = new PrintWriter(new FileWriter(fileRead))) {

            createMatrix(array);
            writer.print(printStringMatrix(array));
            writer.flush();
            writer.close();

            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
            return text;
        } catch (IOException e) {
            return null;
        }
    }

    private static Integer[][] createMatrix(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int temp = (int) (Math.random() * 9);
                array[i][j] = temp % 3;
            }
            int count = 1;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) {
                    if (count > 1) {
                        array[i][j] = (int) (Math.random() * 9) - 9;
                    }
                    count++;
                }
            }
        }
        return array;
    }

    private static String printStringMatrix(Integer[][] array) {
        StringBuffer string = new StringBuffer();
        string.append(array.length).append(" ").append(array[0].length).append("\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                string.append(array[i][j]).append(" ");
            }
            string.append("\n");
        }
        return string.toString();
    }
}