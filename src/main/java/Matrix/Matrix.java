package Matrix;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Matrix {
    public static void main(String[] args) {

        System.out.println(MatrixService.readFromFile());

        MatrixService.mtr(MatrixService.matrixDiagonalBuilder());

//        int matrixSize = MatrixService.countOfStrings();
//
//        Integer[][] array = new Integer[matrixSize][matrixSize];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                if (i == j) {
//                    array[i][j] = 0;
//                } else {
//                    array[i][j] = 1;
//                }
//            }
//        }
//
//        MatrixService arrayMatrix = new MatrixService(array,array.length,array[0].length);
//
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("matrix.txt", false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            writer.write(arrayMatrix.toString());
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(MatrixService.readFromFile());
    }

}
