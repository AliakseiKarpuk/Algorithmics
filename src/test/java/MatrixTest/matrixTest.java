package MatrixTest;

import Matrix.MatrixServices;
import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class matrixTest {

    String fileRead = "src/main/java/Mt/MatrixBefore.txt";
    int size = (int) (Math.random() * 8) + 2;
    Integer[][] array = new Integer[size][size];

    @Test
    public void workTest(){
        MatrixServices mt = new MatrixServices();
        Assert.assertTrue(mt.runner());
    }

    @SneakyThrows
    @Test
    public void readFromFileTest(){
        BufferedReader reader = new BufferedReader(new FileReader(fileRead));
        StringBuilder text = new StringBuilder();
        Assert.assertTrue(MatrixServices.readFromFile(text, reader));
    }

    @SneakyThrows
    @Test
    public void writeToFileTest(){
        PrintWriter newWriter = new PrintWriter(new FileWriter(fileRead));
        Assert.assertTrue(MatrixServices.writeToFile(array, newWriter));
    }

    @Test
    public void createMatrixTest(){
        Assert.assertNotEquals(MatrixServices.createMatrix(array), null);
    }

    @Test
    public void matrixToStringTest(){
        Assert.assertNotEquals(MatrixServices.printStringMatrix(array), null);
    }
}
