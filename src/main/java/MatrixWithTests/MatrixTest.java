package MatrixWithTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixTest {

    @Test
    public void readFromFileTest() {
        Assert.assertFalse(MatrixService.readFromFile().isEmpty());
    }

    @Test
    public void countOfRowsTest() {
        Assert.assertNotEquals(MatrixService.countOfRows(), 0);
    }

    @Test
    public void matrixWriterTest() {
        Assert.assertTrue(MatrixService.matrixWriter());
    }

    @Test
    public void differentMatrixTest(){
       String beforeWrite = MatrixService.readFromFile();
       MatrixService.matrixWriter();
       String afterWrite = MatrixService.readFromFile();
       Assert.assertNotEquals(beforeWrite, afterWrite);
    }
}
