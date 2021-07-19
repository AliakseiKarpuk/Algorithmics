package dataProvider;

import ProductsOfNum.ProductOfNumbersService;
import org.testng.annotations.DataProvider;

public class ProductOfNumbersDataProvider {

    @DataProvider(name = "ProductOfNumbersDataProvider")
    public static Object[][] data(){

        return new Object[][]{
            {new int[]{}, 0},
            {new int[]{10, 15, 2, 7, 20, 64}, 19200},
            {new int[]{-10, -15, -2, -7, -20, -64}, -140},
            {new int[]{200, 1000, 7000, 2000, 1750}, 1400000000},
            {new int[]{-200, -1000, -7000, -2000, -1750}, 1494967296},
            {new int[]{-10, 15, 2, -7, 20, -64}, 12800}
        };
    }
}
