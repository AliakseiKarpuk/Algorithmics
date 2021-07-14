package Matrix;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class MatrixService {

    private Integer array[][];

    public MatrixService(Integer[][] array, int lengthColumn, int lengthRow) {
        this.array = new Integer[lengthColumn][lengthRow];
        for (int i = 0; i < lengthColumn; i++) {
            for (int j = 0; j < lengthColumn; j++) {
                this.array[i][j] = array[i][j];
            }
        }
    }

    public static String readFromFile(){
        String file = "";
        try {
            file = new String(Files.readAllBytes(Paths.get("matrix.txt")));
        } catch (IOException e) {
            System.out.println("Не найден файл");
        }
        return file;
    }

    public static int countOfStrings() {
        List<String> lines = new ArrayList<>();
        Path layout = Paths.get("matrix.txt");
        try {
            lines = Files.readAllLines(layout);

        } catch (IOException e) {
            System.out.println("Не найдены строки");;
        }
        System.out.println();
        return lines.size();
    }

    @Override
    public String toString() {
        return matrixPrint() ;
    }

    private String matrixPrint() {
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                string.append(this.array[i][j]).append(", ");
            }
            string.append("\n");
        }
        return "" + string;
    }

    public static Integer[][] matrixDiagonalBuilder(){

        int matrixSize = MatrixService.countOfStrings();

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

    public static void mtr(Integer[][] array){
        MatrixService arrayMatrix = new MatrixService(array,array.length,array[0].length);

        FileWriter writer = null;
        try {
            writer = new FileWriter("matrix.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writer.write(arrayMatrix.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
