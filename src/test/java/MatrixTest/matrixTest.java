package MatrixTest;

import Mt.MatrixServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class matrixTest {

    @Test
    public void writeToFileTest() {
        MatrixServices mt = new MatrixServices();
        Assert.assertTrue(mt.writeToFile());
    }

    @Test
    public void readNewMatrixTest() {
        MatrixServices mt = new MatrixServices();
        Assert.assertNotEquals(mt.newMatrixArray(), null);
    }

    @Test
    public void readFromFileTest() {
        MatrixServices mt = new MatrixServices();
        Assert.assertNotEquals(mt.readFromFile(), null);
    }
}
