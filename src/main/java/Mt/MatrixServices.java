package Mt;

import java.io.*;
import java.util.Arrays;

public class MatrixServices {

    int size = (int) (Math.random() * 8) + 2;
    Integer[][] array = new Integer[size][size];
    Integer[][] readArray;
    Matrix matrixArray;

    String fileRead = "src/main/java/Mt/MatrixBefore.txt";
    String fileWrite = "src/main/java/Mt/MatrixAfter.txt";

    public boolean runner() {

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileRead));
             PrintWriter writer = new PrintWriter(new FileWriter(fileWrite));
             PrintWriter newWriter = new PrintWriter(new FileWriter(fileRead))) {

            createMatrix(array);
            writeToFile(array, newWriter);
            readFromFile(text, reader);

            String line1 = text.toString();
            String[] string = line1.trim().split("\n");
            String[] length = string[0].trim().split(" ");
            int lengthColumn = Integer.parseInt(length[0]);
            int lengthRow = Integer.parseInt(length[0]);

            readArray = convertFromStringToArray(string, lengthColumn, lengthRow);
            matrixArray = new Matrix(readArray, lengthColumn, lengthRow);
            writer.print(matrixArray);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean readFromFile(StringBuilder text, BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean writeToFile(Integer[][] array, PrintWriter writer1) {
        try {
            writer1.print(printStringMatrix(array));
            writer1.flush();
            writer1.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Integer[][] convertFromStringToArray(String[] text, int lengthRow, int lengthColumn) {
        Integer[][] readArray;
        readArray = new Integer[lengthRow][lengthColumn];

        for (int i = 0; i < text.length - 1; i++) {
            text[i] = text[i + 1];
        }
        String[] stringArrayColumn = Arrays.copyOf(text, text.length - 1);
        for (int i = 0; i < stringArrayColumn.length; i++) {
            String[] stringArrayRow = stringArrayColumn[i].trim().split(" ");
            for (int j = 0; j < stringArrayRow.length; j++) {
                readArray[i][j] = Integer.parseInt(stringArrayRow[j]);
            }
        }
        return readArray;
    }

    public static Integer[][] createMatrix(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int temp = (int) (Math.random() * 2);
                array[i][j] = temp % 3;
            }
            int count = 1;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    if (count > 1) {
                        int number;
                        do {
                            number = (int) (Math.random() * 14) - 5;
                        } while (number == 0);
                        array[i][j] = number;
                    }
                    count++;
                }
            }
        }
        return array;
    }

    public static String printStringMatrix(Integer[][] array) {
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